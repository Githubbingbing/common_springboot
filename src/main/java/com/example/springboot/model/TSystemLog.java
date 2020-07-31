package com.example.springboot.model;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <pre>
 * </pre>
 * <small> 2018年3月23日 | Aron</small>
 */
@Data
@Table(name = "t_system_log")
public class TSystemLog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
//    @Id
    @TableId
    @Column(name = "id")
    private String id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

    /**
     * 用户名称
     */
    @Column(name = "user_name")
    private String username;

    /**
     * 用户操作
     */
    @Column(name = "operation")
    private String operation;

    /**
     * 响应时间
     */
    @Column(name = "time")
    private Integer time;

    /**
     * 请求方法
     */
    @Column(name = "method")
    private String method;

    /**
     * 请求参数
     */
    @Column(name = "params")
    private String params;

    /**
     * 请求id
     */
    @Column(name = "ip")
    private String ip;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 日志类型
     */
    @Column(name = "type")
    private String type;

}