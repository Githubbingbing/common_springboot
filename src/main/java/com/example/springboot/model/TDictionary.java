package com.example.springboot.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 字典表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_dictionary")
public class TDictionary implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键
	 */
		@Id
	@Column(name = "parent_id")
private Integer parentId;
	/**
	 * 父类型编码
	 */
	@Column(name = "parent_code")
private String parentCode;
	/**
	 * 父类型名称
	 */
	@Column(name = "parent_name")
private String parentName;
	/**
	 * 编码
	 */
	@Column(name = "item_code")
private String itemCode;
	/**
	 * 名称
	 */
	@Column(name = "item_name")
private String itemName;
	/**
	 * 排序
	 */
	@Column(name = "orderby")
private Integer orderby;
	/**
	 * 状态
	 */
	@Column(name = "status")
private Integer status;
	/**
	 * flag1
	 */
	@Column(name = "flag1")
private String flag1;
	/**
	 * 1最大权限，增删改 2删改 3增改 4改  5删 6无任何操作
	 */
	@Column(name = "authority")
private Integer authority;

}
