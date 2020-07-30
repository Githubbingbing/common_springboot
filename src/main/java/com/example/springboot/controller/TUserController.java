package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.futuredata.cloud.web.common.vo.Result;

import com.futuredata.cloud.codegen.entity.TUser;
import com.futuredata.cloud.codegen.service.TUserService;


/**
 * 用户表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tuser")
public class TUserController {
    @Autowired
    private TUserService tUserService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TUser tUser){
        return Result.success("新增TUser成功", tUserService.insertSelective(tUser));
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
            tUserService.deleteById(id);
        return Result.success("删除TUser成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TUser tUser){
		tUserService.updateSelectiveById(tUser);
        return Result.success("修改TUser成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TUser成功",tUserService.selectById(id));
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TUser列表成功",null);
    }
}
