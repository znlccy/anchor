package com.youda.anchor.admin.controller;

import com.youda.anchor.admin.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/9-14:58
 * @Version: v1.0.0
 * @Comment: Redis测试控制器
 */

@RestController
public class RedisController {

    @Autowired
    private RedisService redisService;
}
