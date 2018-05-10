package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.mapper.AnchorMapper;
import com.youda.anchor.admin.model.Anchor;
import com.youda.anchor.admin.service.AnchorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/10-11:01
 * @Version: v1.0.0
 * @Comment:
 */
@Service
public class AnchorServiceImpl implements AnchorService {

    /**
     * 实现主播映射的自动依赖注入
     */
    @Autowired
    private AnchorMapper anchorMapper;

    /**
     * 实现获取所有主播信息
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Anchor>
     */
    @Override
    public List<Anchor> getAll() {
        return anchorMapper.getAll();
    }

    /**
     * 实现获取一个主播信息
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Anchor
     */
    @Cacheable(value = "anchor", key = "#id.toString()")
    @Override
    public Anchor getOne(Integer id) {
        return anchorMapper.getOne(id);
    }

    /**
     * 实现添加主播信息
     * @param: [anchor]
     * @return: void
     */
    @CachePut(value = "anchorCache", key = "")
    @Override
    public void insert(Anchor anchor) {
        anchorMapper.insert(anchor);
    }

    /**
     * 实现更新主播信息
     * @param: [anchor]
     * @return: void
     */
    @CachePut(value = "anchorCache", key = "")
    @Override
    public void update(Anchor anchor) {
        anchorMapper.update(anchor);
    }

    /**
     * 实现通过主键删除主播
     * @param: [id]
     * @return: void
     */
    @CacheEvict(key = "#id.toString()", value = "anchorCache")
    @Override
    public void deleteById(Integer id) {
        anchorMapper.deleteById(id);
    }

    /**
     * 实现删除所有主播信息
     * @param: []
     * @return: void
     */
    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() {

    }
}
