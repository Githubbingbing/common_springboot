package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TProvince;
import com.example.springboot.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 系统-省
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tprovince")
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TProvince tProvince){
        return Result.success("新增TProvince成功", null);
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        return Result.success("删除TProvince成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TProvince tProvince){
        return Result.success("修改TProvince成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TProvince成功",null);
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TProvince列表成功",null);
    }
}
