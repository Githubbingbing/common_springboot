package com.example.springboot.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户角色表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_user_role")
public class TUserRole implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 关联表主键
	 */
		@Id
	@Column(name = "user_role_id")
private Integer userRoleId;
	/**
	 * 用户ID
	 */
	@Column(name = "user_id")
private Integer userId;
	/**
	 * 角色id
	 */
	@Column(name = "role_id")
private Integer roleId;

}
