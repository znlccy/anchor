package com.youda.anchor.admin.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.youda.anchor.admin.mapper.SpeakMapper;
import com.youda.anchor.admin.model.Speak;
import com.youda.anchor.admin.service.SpeakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/7-17:42
 * @Version: v1.0.0
 * @Comment: 发言数据服务实现类
 */
@Service
public class SpeakServiceImpl implements SpeakService {

    /**
     * 自动依赖注入speakMapper
     */
    @Autowired
    private SpeakMapper speakMapper;

    /**
     * 实现获得所有发言数据
     */
    @Override
    public List<Speak> getAll() {
        return speakMapper.getAll();
    }

    /**
     * 实现获取一个发言数据
     */
    @Cacheable(key="#id.toString()", value = "speak")
    @Override
    public Speak getOne(Integer id) {
        return speakMapper.getOne(id);
    }

    /**
     * 实现插入一个发言数据
     */
    @CachePut(value = "speakCache", key = "")
    @Override
    public void insert(Speak speak) {
        speakMapper.insert(speak);
    }

    /**
     * 实现更新一个发言数据
     */
    @CachePut(key = "", value = "speakCache")
    @Override
    public void update(Speak speak) {
        speakMapper.update(speak);
    }

    /**
     * 实现通过主键
     */
    @CacheEvict(key = "#id.toString()", value = "speakCache")
    @Override
    public void deleteById(Integer id) {
        speakMapper.deleteById(id);
    }

    /**
     * 实现删除所有数据
     */
    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() {

    }
}
