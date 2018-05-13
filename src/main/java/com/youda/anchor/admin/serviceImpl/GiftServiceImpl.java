package com.youda.anchor.admin.serviceImpl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.youda.anchor.admin.mapper.GiftMapper;
import com.youda.anchor.admin.model.Gift;
import com.youda.anchor.admin.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/10-15:41
 * @Version: v1.0.0
 * @Comment: 礼物服务实现类
 */
@Service
public class GiftServiceImpl implements GiftService {

    /**
     * 实现礼物映射的自动依赖注入
     */
    @Autowired
    private GiftMapper giftMapper;

    /**
     * 实现获取所有礼物数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Gift>
     */
    @Override
    public List<Gift> getAll() {
        return giftMapper.getAll();
    }

    /**
     * 实现分页查询礼物
     * @param: [pageNo, pageSize]
     * @return: com.github.pagehelper.Page<com.youda.anchor.admin.model.Gift>
     */
    @Override
    public List<Gift> getByPage(int pageNo, int pageSize) throws Exception{
        //使用分页插件
        PageHelper.startPage(pageNo, pageSize);
        //获取
        List<Gift> gifts = giftMapper.getByPage();
        return gifts;
    }

    /**
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Gift
     */
    @Cacheable(value = "gift", key = "#id.toString()")
    @Override
    public Gift getOne(Integer id) {
        return null;
    }

    /**
     * @param: [gift]
     * @return: void
     */
    @CachePut(value = "giftCache", key = "")
    @Override
    public void insert(Gift gift) {

    }

    /**
     * @param: [gift]
     * @return: void
     */
    @CachePut(value = "giftCache", key = "")
    @Override
    public void update(Gift gift) {

    }

    /**
     * @param: [id]
     * @return: void
     */
    @CacheEvict(key = "#id.toString()")
    @Override
    public void deleteById(Integer id) {

    }

    /**
     * 实现删除所有的礼物数据
     * @param: []
     * @return: void
     */
    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() {

    }
}
