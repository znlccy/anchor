package com.youda.anchor.admin.controller;

import com.youda.anchor.admin.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/9-14:58
 * @Version: v1.0.0
 * @Comment: Redis测试控制器
 */

@RestController
@RequestMapping(value = "/redis")
public class RedisController {

    /**
     * 实现RedisService自动依赖注入
     */
    @Autowired
    private RedisService redisService;

    /**
     * 
     * @param: []
     * @return: void
     */
    @PostMapping(value = "/add")
    public void add() {
        redisService.set("name", "demo");
    }

    @GetMapping(value = "/get")
    public String get() {
        return redisService.get("name");
    }
}
