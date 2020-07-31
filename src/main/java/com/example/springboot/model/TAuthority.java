package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 权限表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_authority")
public class TAuthority implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name = "id")
    private String id;
    /**
     * 权限ID
     */
    @Column(name = "auth_id")
    private Integer authId;
    /**
     * 权限CODE业务主键
     */
    @Column(name = "auth_code")
    private String authCode;
    /**
     * 父权限
     */
    @Column(name = "parent_auth_code")
    private String parentAuthCode;
    /**
     * 权限名称
     */
    @Column(name = "auth_name")
    private String authName;
    /**
     * 访问路径
     */
    @Column(name = "auth_url")
    private String authUrl;
    /**
     * 类型
     */
    @Column(name = "auth_type")
    private String authType;
    /**
     * 访问顺序
     */
    @Column(name = "auth_orderby")
    private Integer authOrderby;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
    /**
     * 请求类型（1--pc 2--手机  -- 所有）
     */
    @Column(name = "request_type")
    private String requestType;
    /**
     * 图标
     */
    @Column(name = "icon")
    private String icon;

}
