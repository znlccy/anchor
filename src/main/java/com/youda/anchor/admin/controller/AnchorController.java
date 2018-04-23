package com.youda.anchor.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Administrator
 * @Datetime: 2018/4/23-16:40
 * @Version: v1.0.0
 * @Comment: 主播控制器
 */
@RestController
@RequestMapping(value = "/admin/anchor")
@Api("主播相关的Api文档")
public class AnchorController {

    @PostMapping(value = "/add")
    public void add() {
        System.out.println("添加");
    }

    /**
     * @param: [id] 主播主键
     * @return: void
     */
    @ApiOperation(value = "根据id编辑主播信息", notes = "编辑数据库中某个主播信息")
    @ApiImplicitParam(name = "id", value = "主播ID", paramType = "path", required = true, dataType = "Long")
    @PutMapping(value = "/edit/{id}")
    public void edit(@PathVariable("id") Long id) {
        System.out.println("编辑");
    }

    @DeleteMapping(value = "/del/{id}")
    public void delete(@PathVariable("id") Long id) {
        System.out.println("删除");
    }

    @GetMapping(value = "/getId/{id}")
    @ApiOperation(value = "根据id查询主播信息", notes = "查询数据库中某个主播信息")
    @ApiImplicitParam(name = "id", value = "主播ID", paramType = "path", required = true, dataType = "Long")
    public void queryId(@PathVariable("id") Long id) {
        System.out.println("主键查找");
    }

    @GetMapping(value = "/getAll")
    public void queryAll() {
        System.out.println("获取所有数据");
    }
}
