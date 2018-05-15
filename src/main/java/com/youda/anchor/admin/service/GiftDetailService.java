package com.youda.anchor.admin.service;

import com.github.pagehelper.Page;
import com.youda.anchor.admin.model.GiftDetail;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-10:43
 * @Version: v1.0.0
 * @Comment: 实现礼物详情服务接口
 */
public interface GiftDetailService {
    
    /**
     * 声明获得所有礼物详情
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.GiftDetail>
     */
    List<GiftDetail> getAll();

    /**
     * 声明分页获得礼物详情
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.GiftDetail>
     */
    List<GiftDetail> getByPage();

    /**
     * 声明获取一个礼物详情
     * @param: []
     * @return: com.youda.anchor.admin.model.GiftDetail
     */
    GiftDetail getOne();

    /**
     * 声明添加一个礼物详情
     * @param: [giftDetail]
     * @return: void
     */
    void insert(GiftDetail giftDetail);

    /**
     * 声明更新一个礼物详情
     * @param: [giftDetail]
     * @return: void
     */
    void update(GiftDetail giftDetail);

    /**
     * 声明删除一个礼物详情
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 声明删除所有礼物详情
     * @param: []
     * @return: void
     */
    void deleteAll();
}
