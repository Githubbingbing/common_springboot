package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TLoginLog;
import com.example.springboot.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 登录日志表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tloginlog")
public class LoginLogController {
    @Autowired
    private LoginLogService loginLogService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TLoginLog tLoginLog){
        return Result.success("新增TLoginLog成功", null);
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        return Result.success("删除TLoginLog成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TLoginLog tLoginLog){
        return Result.success("修改TLoginLog成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TLoginLog成功",null);
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TLoginLog列表成功",null);
    }
}
