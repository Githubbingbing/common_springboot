package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.futuredata.cloud.web.common.vo.Result;

import com.futuredata.cloud.codegen.entity.TAttachInfo;
import com.futuredata.cloud.codegen.service.TAttachInfoService;


/**
 * 附件信息表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tattachinfo")
public class TAttachInfoController {
    @Autowired
    private TAttachInfoService tAttachInfoService;

    /**
     * 保存
     */
    @PostMapping()
    public Result save(@RequestBody TAttachInfo tAttachInfo){
        return Result.success("新增TAttachInfo成功", tAttachInfoService.insertSelective(tAttachInfo));
    }

    /**
    * 删除
    */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") String id){
            tAttachInfoService.deleteById(id);
        return Result.success("删除TAttachInfo成功");
    }

    /**
     * 修改
     */
    @PutMapping()
    public Result update(@RequestBody TAttachInfo tAttachInfo){
		tAttachInfoService.updateSelectiveById(tAttachInfo);
        return Result.success("修改TAttachInfo成功");
    }
    /**
       * 信息
       */
    @RequestMapping("/{id}")
    public Result info(@PathVariable("id") String id){
        return Result.success("获取TAttachInfo成功",tAttachInfoService.selectById(id));
    }

    /**
   * 列表
   */
    @RequestMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TAttachInfo列表成功",null);
    }
}
