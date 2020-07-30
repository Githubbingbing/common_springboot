package com.example.springboot.base;

import com.github.pagehelper.Page;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * 分页数据包装
 * @author Kevin Ma
 * @param <T>
 */
@ToString
@Getter
@Setter
public class DataPage<T> implements Serializable {
    private long total = 0;
    private List<T> data;

    public DataPage(long total, List<T> data) {
        this.total = total;
        this.data = data;
    }

    public DataPage(Page<T> page) {
        this.total = page.getTotal();
        this.data = page.getResult();
    }
}
