package com.example.springboot.controller;

import com.example.springboot.base.Result;
import com.example.springboot.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author bingbing
 * @email bingbing
 * @date 2020-07-29 16:19:21
 */
@RestController
@RequestMapping("/api/tareas")
public class AreasController {

    @Autowired
    private AreasService areasService;

    @GetMapping
    public Result getList() {
        return Result.success("操作成功", areasService.list());
    }

}
