package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Data
@Table(name = "t_areas")
public class TAreas implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @Id
    @Column(name = "id")
    private String id;
    /**
     *
     */
    @Column(name = "areaid")
    private String areaid;
    /**
     *
     */
    @Column(name = "area")
    private String area;
    /**
     *
     */
    @Column(name = "city_code")
    private String cityCode;
    /**
     * 1 已开通 0未开通
     */
    @Column(name = "status")
    private Integer status;

}
