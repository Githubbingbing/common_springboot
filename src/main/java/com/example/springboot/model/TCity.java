package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 系统-市
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_city")
public class TCity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * city_id
     */
    @Id
    @Column(name = "city_id")
    private Integer cityId;
    /**
     * 城市编码
     */
    @Column(name = "city_code")
    private String cityCode;
    /**
     * 城市名称
     */
    @Column(name = "city_name")
    private String cityName;
    /**
     * 省份
     */
    @Column(name = "province_code")
    private String provinceCode;
    /**
     * 1 已开通 0未开通
     */
    @Column(name = "status")
    private Integer status;

}
