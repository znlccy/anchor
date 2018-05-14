package com.youda.anchor.admin.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.youda.anchor.admin.model.Gift;
import com.youda.anchor.admin.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/10-15:53
 * @Version: v1.0.0
 * @Comment: 礼物控制器
 */
@RestController
@RequestMapping(value = "/admin/gift")
public class GiftController {

    /**
     * 声明礼物服务
     */
    @Autowired
    private GiftService giftService;

    /**
     * 实现分页查询礼物数据
     * @param: []
     * @return: org.springframework.http.ResponseEntity
     */
    @GetMapping(value = "/page")
    @ResponseBody
    public List<Gift> getByPage(int pageNum, int pageSize){
        return giftService.getByPage(pageNum, pageSize);
    }

    /**
     * 实现查询所有礼物数据
     * @param: []
     * @return: java.lang.String
     */
    @GetMapping(value = "/all")
    @ResponseBody
    public String getAll(){
        List<Gift> gifts = giftService.getAll();
        return gifts.toString();
    }

}
