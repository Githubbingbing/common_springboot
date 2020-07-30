package com.example.springboot.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 登录日志表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_login_log")
public class TLoginLog implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 登录日志表主键
	 */
		@Id
	@Column(name = "log_id")
private Integer logId;
	/**
	 * 登录ip
	 */
	@Column(name = "log_ip")
private String logIp;
	/**
	 * 登陆人id
	 */
	@Column(name = "log_user_id")
private Integer logUserId;
	/**
	 * 登陆名称
	 */
	@Column(name = "login_name")
private String loginName;
	/**
	 * 登录时间
	 */
	@Column(name = "login_time")
private Date loginTime;

}
