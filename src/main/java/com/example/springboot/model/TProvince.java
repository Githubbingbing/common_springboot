package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 系统-省
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_province")
public class TProvince implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * province_id
     */
    @Id
    @Column(name = "province_id")
    private Integer provinceId;
    /**
     * 编码
     */
    @Column(name = "province_code")
    private String provinceCode;
    /**
     * 名称
     */
    @Column(name = "province_name")
    private String provinceName;
    /**
     *
     */
    @Column(name = "status")
    private Integer status;
    /**
     * 简称
     */
    @Column(name = "short_name")
    private String shortName;
    /**
     * 排序
     */
    @Column(name = "sort_num")
    private Integer sortNum;

}
