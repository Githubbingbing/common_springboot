package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 角色
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_role")
public class TRole implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @Id
    @Column(name = "role_id")
    private Integer roleId;
    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;
    /**
     *
     */
    @Column(name = "orderby")
    private Integer orderby;

}
