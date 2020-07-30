package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TCity;
import com.example.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 系统-市
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tcity")
public class CityController {
    @Autowired
    private CityService cityService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TCity tCity) {
        return Result.success("新增TCity成功", null);
    }

    /**
     * 删除
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id) {
        return Result.success("删除TCity成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TCity tCity) {
        return Result.success("修改TCity成功");
    }

    /**
     * 信息
     */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id) {
        return Result.success("获取TCity成功", null);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params) {
        return Result.success("查询TCity列表成功", null);
    }
}
