package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 操作日志
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_operation_log")
public class TOperationLog implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @Id
    @Column(name = "operation_id")
    private Integer operationId;
    /**
     * 操作 名称
     */
    @Column(name = "operation_name")
    private String operationName;
    /**
     * 操作内容
     */
    @Column(name = "operation_content")
    private String operationContent;
    /**
     * 操作日期
     */
    @Column(name = "createdate")
    private Date createdate;
    /**
     * 操作人
     */
    @Column(name = "operation_user")
    private Integer operationUser;
    /**
     * 操作人名称
     */
    @Column(name = "operation_user_name")
    private String operationUserName;
    /**
     * 操作类型
     */
    @Column(name = "operation_type")
    private String operationType;

}
