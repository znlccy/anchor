package com.youda.anchor.admin.controller;

import com.youda.anchor.admin.model.Platform;
import com.youda.anchor.admin.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/13-18:35
 * @Version: v1.0.0
 * @Comment: 平台控制器
 */
@RestController
@RequestMapping(value = "/admin/platform")
public class PlatformController {

    /**
     * 实现平台服务的自动依赖注入
     */
    @Autowired
    private PlatformService platformService;

    /**
     * 实现分页获取平台数据
     * @param: [pageNum, pageSize]
     * @return: java.util.List<com.youda.anchor.admin.model.Platform>
     */
    @GetMapping(value = "/page")
    @ResponseBody
    public List<Platform> getByPage(int pageNum, int pageSize) throws Exception{
        return platformService.getByPage(pageNum, pageSize);
    }

}
