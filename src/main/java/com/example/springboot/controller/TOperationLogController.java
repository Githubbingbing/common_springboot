package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.futuredata.cloud.web.common.vo.Result;

import com.futuredata.cloud.codegen.entity.TOperationLog;
import com.futuredata.cloud.codegen.service.TOperationLogService;


/**
 * 操作日志
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/toperationlog")
public class TOperationLogController {
    @Autowired
    private TOperationLogService tOperationLogService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TOperationLog tOperationLog){
        return Result.success("新增TOperationLog成功", tOperationLogService.insertSelective(tOperationLog));
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
            tOperationLogService.deleteById(id);
        return Result.success("删除TOperationLog成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TOperationLog tOperationLog){
		tOperationLogService.updateSelectiveById(tOperationLog);
        return Result.success("修改TOperationLog成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TOperationLog成功",tOperationLogService.selectById(id));
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TOperationLog列表成功",null);
    }
}
