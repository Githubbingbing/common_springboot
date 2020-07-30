package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TDictionary;
import com.example.springboot.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 字典表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tdictionary")
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TDictionary tDictionary){
        return Result.success("新增TDictionary成功", null);
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        return Result.success("删除TDictionary成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TDictionary tDictionary){
        return Result.success("修改TDictionary成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TDictionary成功",null);
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TDictionary列表成功",null);
    }
}
