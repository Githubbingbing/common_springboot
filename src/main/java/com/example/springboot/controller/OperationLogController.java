package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TOperationLog;
import com.example.springboot.service.OperationLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 操作日志
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/toperationlog")
public class OperationLogController {
    @Autowired
    private OperationLogService operationLogService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TOperationLog tOperationLog){
        return Result.success("新增TOperationLog成功", null);
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        return Result.success("删除TOperationLog成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TOperationLog tOperationLog){
        return Result.success("修改TOperationLog成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TOperationLog成功",null);
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TOperationLog列表成功",null);
    }
}
