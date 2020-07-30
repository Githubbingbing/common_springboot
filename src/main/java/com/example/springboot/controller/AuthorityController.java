package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TAuthority;
import com.example.springboot.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 权限表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tauthority")
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TAuthority tAuthority){
        return Result.success("新增TAuthority成功", null);
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
        return Result.success("删除TAuthority成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TAuthority tAuthority){
        return Result.success("修改TAuthority成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TAuthority成功",null);
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TAuthority列表成功",null);
    }
}
