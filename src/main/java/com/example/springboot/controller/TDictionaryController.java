package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.futuredata.cloud.web.common.vo.Result;

import com.futuredata.cloud.codegen.entity.TDictionary;
import com.futuredata.cloud.codegen.service.TDictionaryService;


/**
 * 字典表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tdictionary")
public class TDictionaryController {
    @Autowired
    private TDictionaryService tDictionaryService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TDictionary tDictionary){
        return Result.success("新增TDictionary成功", tDictionaryService.insertSelective(tDictionary));
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
            tDictionaryService.deleteById(id);
        return Result.success("删除TDictionary成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TDictionary tDictionary){
		tDictionaryService.updateSelectiveById(tDictionary);
        return Result.success("修改TDictionary成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TDictionary成功",tDictionaryService.selectById(id));
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TDictionary列表成功",null);
    }
}
