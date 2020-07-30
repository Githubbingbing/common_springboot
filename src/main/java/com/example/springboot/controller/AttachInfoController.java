package com.example.springboot.controller;

import java.util.Arrays;
import java.util.Map;

import com.example.springboot.base.Result;
import com.example.springboot.model.TAttachInfo;
import com.example.springboot.service.AttachInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 附件信息表
 *
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tattachinfo")
public class AttachInfoController {
    @Autowired
    private AttachInfoService attachInfoService;


    /**
   * 列表
   */
    @GetMapping("/list")
    public Result list(@RequestParam Map<String, Object> params){
        return Result.success("查询TAttachInfo列表成功",null);
    }
}
