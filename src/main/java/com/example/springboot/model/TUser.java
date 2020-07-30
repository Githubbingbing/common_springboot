package com.example.springboot.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_user")
public class TUser implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 用户id--主键
	 */
		@Id
	@Column(name = "user_id")
private Integer userId;
	/**
	 * 用户num
	 */
	@Column(name = "user_num")
private String userNum;
	/**
	 * 用户真实姓名
	 */
	@Column(name = "nick_name")
private String nickName;
	/**
	 * 用户登录名称
	 */
	@Column(name = "login_name")
private String loginName;
	/**
	 * 登录密码
	 */
	@Column(name = "login_pass")
private String loginPass;
	/**
	 * 
	 */
	@Column(name = "user_sex")
private Integer userSex;
	/**
	 * 联系方式
	 */
	@Column(name = "link_tel")
private String linkTel;
	/**
	 * 1 系统用户  2招标商 3投标商 4代理商
	 */
	@Column(name = "user_type")
private Integer userType;
	/**
	 * 用户状态 1/0 正常/禁用
	 */
	@Column(name = "user_status")
private Integer userStatus;
	/**
	 * 创建人
	 */
	@Column(name = "create_user_num")
private String createUserNum;
	/**
	 * 创建时间
	 */
	@Column(name = "create_date")
private Date createDate;
	/**
	 * 
	 */
	@Column(name = "flag1")
private String flag1;
	/**
	 * 
	 */
	@Column(name = "flag2")
private String flag2;
	/**
	 * 
	 */
	@Column(name = "flag3")
private String flag3;

}
