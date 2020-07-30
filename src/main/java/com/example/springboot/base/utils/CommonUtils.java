package com.example.springboot.base.utils;

import com.example.springboot.base.constants.Constants;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

/**
 * @author guibing.lin
 * @date 2020/7/29
 */
public class CommonUtils {
    /**
     * 获取当前登录用户ID
     * @return userId
     */
    public static String getUserId() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        String id = Constants.SYSTEM_USER_ID;
        if (Objects.nonNull(servletRequestAttributes) && Objects.nonNull(servletRequestAttributes.getRequest()) ) {
            HttpServletRequest request = servletRequestAttributes.getRequest();
            if (Objects.nonNull(request)) {
                id = request.getHeader(Constants.ZUUL_REQ_HEADER_USER_ID);
            }
        }
        return id;
    }

    /**
     * 前端排序类型转换为数据库排序类型
     * @param orderType
     * @return
     */
    public static  String convertOrderType(String orderType) {
        if (Constants.ASCENDING.equals(orderType)) {
            return Constants.ASC;
        } else if (Constants.DESCENDING.equals(orderType)) {
            return Constants.DESC;
        }
        return "";
    }

    /**
     * 前端排序类型转换为数据库排序类型
     * @param orderType
     * @return
     */
    public static  Boolean isAsc(String orderType) {
        if (Constants.ASCENDING.equals(orderType)) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
