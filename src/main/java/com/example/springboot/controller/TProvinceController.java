package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.futuredata.cloud.web.common.vo.Result;

import com.futuredata.cloud.codegen.entity.TProvince;
import com.futuredata.cloud.codegen.service.TProvinceService;


/**
 * 系统-省
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tprovince")
public class TProvinceController {
    @Autowired
    private TProvinceService tProvinceService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TProvince tProvince){
        return Result.success("新增TProvince成功", tProvinceService.insertSelective(tProvince));
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
            tProvinceService.deleteById(id);
        return Result.success("删除TProvince成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TProvince tProvince){
		tProvinceService.updateSelectiveById(tProvince);
        return Result.success("修改TProvince成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TProvince成功",tProvinceService.selectById(id));
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TProvince列表成功",null);
    }
}
