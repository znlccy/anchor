package com.youda.anchor.admin.controller;

import com.youda.anchor.admin.model.Platform;
import com.youda.anchor.admin.model.Popular;
import com.youda.anchor.admin.service.PopularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/14-13:17
 * @Version: v1.0.0
 * @Comment: 人气控制器
 */
@RestController
@RequestMapping(value = "/admin/popular")
public class PopularController {

    @Autowired
    private PopularService popularService;

    @GetMapping(value = "/page")
    @ResponseBody
    public List<Popular> getByPage(int pageNum, int pageSize){
        return popularService.getByPage(pageNum, pageSize);
    }
}
