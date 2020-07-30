package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TUserRole;
import com.example.springboot.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 用户角色表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tuserrole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TUserRole tUserRole){
        return Result.success("新增TUserRole成功", null);
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        return Result.success("删除TUserRole成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TUserRole tUserRole){
        return Result.success("修改TUserRole成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TUserRole成功",null);
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TUserRole列表成功",null);
    }
}
