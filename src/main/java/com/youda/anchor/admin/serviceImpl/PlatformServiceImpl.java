package com.youda.anchor.admin.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.youda.anchor.admin.mapper.PlatformMapper;
import com.youda.anchor.admin.model.Platform;
import com.youda.anchor.admin.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/13-17:28
 * @Version: v1.0.0
 * @Comment: 平台服务实现类
 */
@Service
public class PlatformServiceImpl implements PlatformService {

    /**
     * 声明平台映射类的自动依赖注入
     */
    @Autowired
    private PlatformMapper platformMapper;

    /**
     * 实现获取所有平台数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Platform>
     */
    @Cacheable(value = "paltformAll")
    @Override
    public List<Platform> getAll() throws Exception {
        return platformMapper.getAll();
    }

    /**
     * 实现分页查询平台数据
     * @param: [pageNo, pageSize]
     * @return: java.util.List<com.youda.anchor.admin.model.Platform>
     */
    @Cacheable(value = "platformPage")
    @Override
    public List<Platform> getByPage(int pageNum, int pageSize) throws Exception {
        /*使用分页插件*/
        PageHelper.startPage(pageNum, pageSize);
        /*获取*/
        List<Platform> platforms = platformMapper.getByPage();
        return platforms;
    }

    /**
     * 实现获取一个平台数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Platform
     */
    @Cacheable(key = "#id.toString()", value = "platform")
    @Override
    public Platform getOne(Integer id) throws Exception {
        return platformMapper.getOne(id);
    }

    /**
     * 实现添加一个平台数据
     * @param: [platform]
     * @return: void
     */
    @CachePut(value = "platformCache", key = "")
    @Override
    public void insert(Platform platform) throws Exception {
        platformMapper.insert(platform);
    }

    /**
     * 实现修改一个平台数据
     * @param: [platform]
     * @return: void
     */
    @CachePut(value = "platformCache", key = "")
    @Override
    public void update(Platform platform) throws Exception {
        platformMapper.update(platform);
    }

    /**
     * 实现删除一个平台数据
     * @param: [id]
     * @return: void
     */
    @CacheEvict(key = "#id.toString()")
    @Override
    public void deleteById(Integer id) throws Exception {
        platformMapper.deleteById(id);
    }

    /**
     * 实现删除所有数据
     * @param: []
     * @return: void
     */
    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() throws Exception {
        platformMapper.deleteAll();
    }
}
