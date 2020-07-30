package com.example.springboot.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 角色权限关联表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_role_authority")
public class TRoleAuthority implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
		@Id
	@Column(name = "role_authority_id")
private Integer roleAuthorityId;
	/**
	 * 权限code
	 */
	@Column(name = "auth_code")
private String authCode;
	/**
	 * 角色ID
	 */
	@Column(name = "role_id")
private Integer roleId;

}
