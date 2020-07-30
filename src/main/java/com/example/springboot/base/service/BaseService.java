package com.example.springboot.base.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.core.toolkit.LambdaUtils;
import com.baomidou.mybatisplus.core.toolkit.support.ColumnCache;
import com.baomidou.mybatisplus.core.toolkit.support.SFunction;
import com.baomidou.mybatisplus.core.toolkit.support.SerializedLambda;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.base.DataPage;
import com.example.springboot.base.utils.CommonUtils;
import com.example.springboot.base.vo.BaseQueryVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.reflection.property.PropertyNamer;
import org.springframework.util.StringUtils;

import java.lang.reflect.ParameterizedType;
import java.util.*;

/**
 * 基础的服务层
 */
public class BaseService<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements IService<T> {


    public Object page(BaseQueryVo queryVo) {
        LambdaQueryWrapper<T> wrapper = getQueryWrapper(queryVo);
        return page(wrapper, queryVo.getOffset(), queryVo.getLimit());
    }
    public Object list(BaseQueryVo queryVo) {
        LambdaQueryWrapper<T> wrapper = getQueryWrapper(queryVo);
        return list(wrapper);
    }

    public DataPage<T> page(Wrapper<T> wrapper, Integer offset, Integer limit) {
        Page<T> page = PageHelper.offsetPage(offset, limit);
        baseMapper.selectList(wrapper);
        return new DataPage<>(page);
    }

    public Object query(BaseQueryVo queryVo) {
        if (queryVo.getPaging()) {
            return this.page(queryVo);
        } else {
            return this.list(queryVo);
        }
    }

    /**
     * 构造基础的关键字查询语句, 子类重写该方法，构造个性化查询条件
     *
     * @param queryVo 查询参数
     * @return
     */
    public LambdaQueryWrapper<T> getQueryWrapper(BaseQueryVo queryVo) {
        LambdaQueryWrapper<T> wrapper = new LambdaQueryWrapper<>();
        if (Objects.isNull(queryVo)) {
            return wrapper;
        }
        List<SFunction<T, Object>> columns = getKeywordColumns();
        // 构造关键字查询
        if (StringUtils.hasLength(queryVo.getKeyword())
                && CollectionUtils.isNotEmpty(columns)) {
            StringBuilder sb = new StringBuilder();
            List<String> params = new ArrayList<>();
            for (int i = 0; i < columns.size(); i++) {
                String fieldName = columnToString(columns.get(i));
                if (StringUtils.hasLength(fieldName)) {
                    int paramSize = params.size();
                    if (paramSize > 0) {
                        sb.append(" + ");
                    }
                    sb.append("ifnull(instr(")
                            .append(fieldName)
                            .append(", {").append(paramSize).append("}), 0)");
                    params.add(queryVo.getKeyword());
                }
            }
            if (params.size() > 0) {
                sb.append(" > 0");
                wrapper.apply(sb.toString(), params.toArray());
            }
        }
        // 构造排序
        if (StringUtils.hasLength(queryVo.getOrderField())) {
            Map<String, ColumnCache> columnCacheMap = LambdaUtils.getColumnMap(getEntityClass());
            ColumnCache columnCache = Objects.nonNull(columnCacheMap) ? columnCacheMap.get(LambdaUtils.formatKey(queryVo.getOrderField())) : null;
            String orderColumn = Objects.isNull(columnCache) ? null : columnCache.getColumn();
            if (StringUtils.hasLength(orderColumn)) {
                // order by orderField orderType
                wrapper.last(StringUtils.hasLength(queryVo.getOrderField()),
                        "order by " + orderColumn + " " + CommonUtils.convertOrderType(queryVo.getOrderType()));
            }
        }
        getExtendQueryWrapper(wrapper, queryVo);
        return wrapper;
    }

    protected void getExtendQueryWrapper(LambdaQueryWrapper<T> wrapper, BaseQueryVo queryVo) {}

    /**
     * 获取需要关键字查询的列，默认空，子类重写该方法增加需要关键字查询的列，
     *
     * @return
     */
    public List<SFunction<T, Object>> getKeywordColumns() {
        return null;
    }

    /**
     * 获取列的数据库字段名
     */
    protected String columnToString(SFunction<T, Object> column) {
        return getColumn(LambdaUtils.resolve(column), Boolean.TRUE);
    }

    /**
     * 获取泛型 T 的class对象
     *
     * @return
     */
    protected Class<T> getEntityClass() {
        Class<T> clz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[1];
        return clz;
    }

    private String getColumn(SerializedLambda lambda, boolean onlyColumn) throws MybatisPlusException {
        String fieldName = PropertyNamer.methodToProperty(lambda.getImplMethodName());
        Class aClass = lambda.getInstantiatedMethodType();
        Map<String, ColumnCache> columnMap = LambdaUtils.getColumnMap(aClass);
        Assert.notNull(columnMap, "can not find lambda cache for this entity [%s]", aClass.getName());
        ColumnCache columnCache = columnMap.get(LambdaUtils.formatKey(fieldName));
        Assert.notNull(columnCache, "can not find lambda cache for this property [%s] of entity [%s]",
                fieldName, aClass.getName());
        return onlyColumn ? columnCache.getColumn() : columnCache.getColumnSelect();
    }

    public Object queryById(String id) {
        return getById(id);
    }

}