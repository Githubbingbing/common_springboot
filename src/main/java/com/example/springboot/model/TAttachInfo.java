package com.example.springboot.model;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 附件信息表
 * 
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_attach_info")
public class TAttachInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
		@Id
	@Column(name = "attach_id")
private Integer attachId;
	/**
	 * 附件路径
	 */
	@Column(name = "file_path")
private String filePath;
	/**
	 * 附件名称
	 */
	@Column(name = "file_name")
private String fileName;
	/**
	 * 附件大小
	 */
	@Column(name = "file_size")
private String fileSize;
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
	/**
	 * 创建人num
	 */
	@Column(name = "user_num")
private String userNum;
	/**
	 * 创建时间
	 */
	@Column(name = "create_time")
private Date createTime;
	/**
	 * 图片类型
	 */
	@Column(name = "attach_type")
private Integer attachType;
	/**
	 * 关联ID
	 */
	@Column(name = "gl_num")
private String glNum;

}
