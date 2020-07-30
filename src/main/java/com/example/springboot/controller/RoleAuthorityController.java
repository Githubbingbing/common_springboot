package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TRoleAuthority;
import com.example.springboot.service.RoleAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 角色权限关联表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/troleauthority")
public class RoleAuthorityController {
    @Autowired
    private RoleAuthorityService roleAuthorityService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TRoleAuthority tRoleAuthority){
        return Result.success("新增TRoleAuthority成功", null);
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        return Result.success("删除TRoleAuthority成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TRoleAuthority tRoleAuthority){
        return Result.success("修改TRoleAuthority成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TRoleAuthority成功",null);
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TRoleAuthority列表成功",null);
    }
}
