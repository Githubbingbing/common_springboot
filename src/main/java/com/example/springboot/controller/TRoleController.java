package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.futuredata.cloud.web.common.vo.Result;

import com.futuredata.cloud.codegen.entity.TRole;
import com.futuredata.cloud.codegen.service.TRoleService;


/**
 * 角色
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/trole")
public class TRoleController {
    @Autowired
    private TRoleService tRoleService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TRole tRole){
        return Result.success("新增TRole成功", tRoleService.insertSelective(tRole));
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
            tRoleService.deleteById(id);
        return Result.success("删除TRole成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TRole tRole){
		tRoleService.updateSelectiveById(tRole);
        return Result.success("修改TRole成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TRole成功",tRoleService.selectById(id));
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TRole列表成功",null);
    }
}
