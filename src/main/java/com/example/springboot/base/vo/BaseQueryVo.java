package com.example.springboot.base.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 基础查询VO
 * @author Kevin Ma
 */
@Data
public class BaseQueryVo implements Serializable {

    /**
     * 偏移
     */
    private Integer offset = 0;
    /**
     * 限量
     */
    private Integer limit = 0;

    /**
     * 是否分页
     */
    private Boolean paging = Boolean.TRUE;

    /**
     * 查询关键字
     */
    private String keyword;
    /**
     * 排序字段
     */
    private String orderField;
    /**
     * 排序方式
     */
    private String orderType;
    /**
     * 用户ID
     */
    private String userId;

}
