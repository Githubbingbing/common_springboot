package com.example.springboot.controller;

import com.example.springboot.base.Result;
import com.example.springboot.base.annotation.Log;
import com.example.springboot.service.AreasService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@Slf4j
@RestController
@RequestMapping("/api/tareas")
public class AreasController {

    @Autowired
    private AreasService areasService;

    @GetMapping
    @Log(type = "controller",value = "获取地区列表")
    public Result getList() {
        return Result.success("操作成功", areasService.list());
    }

}
