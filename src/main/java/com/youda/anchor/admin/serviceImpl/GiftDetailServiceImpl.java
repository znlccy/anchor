package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.mapper.GiftDetailMapper;
import com.youda.anchor.admin.model.GiftDetail;
import com.youda.anchor.admin.service.GiftDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-10:44
 * @Version: v1.0.0
 * @Comment: 
 */
@Service
public class GiftDetailServiceImpl implements GiftDetailService {

    /**
     * 声明自动依赖注入礼物详情服务
     */
    @Autowired
    private GiftDetailMapper giftDetailMapper;

    /**
     * 实现获得所有礼物详情
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.GiftDetail>
     */
    @Override
    public List<GiftDetail> getAll() {
        return null;
    }

    /**
     * 实现分页获得礼物详情
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.GiftDetail>
     */
    @Override
    public List<GiftDetail> getByPage() {
        return null;
    }

    /**
     * 实现获得一个礼物详情
     * @param: []
     * @return: com.youda.anchor.admin.model.GiftDetail
     */
    @Override
    public GiftDetail getOne() {
        return null;
    }

    /**
     * 实现添加一个礼物详情
     * @param: [giftDetail]
     * @return: void
     */
    @Override
    public void insert(GiftDetail giftDetail) {

    }

    /**
     * 实现更新一个礼物详情
     * @param: [giftDetail]
     * @return: void
     */
    @Override
    public void update(GiftDetail giftDetail) {

    }

    /**
     * 实现删除一个礼物详情
     * @param: [id]
     * @return: void
     */
    @Override
    public void deleteById(Integer id) {

    }

    /**
     * 实现删除所有礼物详情
     * @param: []
     * @return: void
     */
    @Override
    public void deleteAll() {

    }
}
