package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.futuredata.cloud.web.common.vo.Result;

import com.futuredata.cloud.codegen.entity.TAuthority;
import com.futuredata.cloud.codegen.service.TAuthorityService;


/**
 * 权限表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tauthority")
public class TAuthorityController {
    @Autowired
    private TAuthorityService tAuthorityService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TAuthority tAuthority){
        return Result.success("新增TAuthority成功", tAuthorityService.insertSelective(tAuthority));
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
            tAuthorityService.deleteById(id);
        return Result.success("删除TAuthority成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TAuthority tAuthority){
		tAuthorityService.updateSelectiveById(tAuthority);
        return Result.success("修改TAuthority成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TAuthority成功",tAuthorityService.selectById(id));
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TAuthority列表成功",null);
    }
}
