package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.mapper.SessionMapper;
import com.youda.anchor.admin.model.Session;
import com.youda.anchor.admin.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/21-11:21
 * @Version: v1.0.0
 * @Comment: 场次服务接口实现类
 */
@Service
public class SessionServiceImpl implements SessionService {

    /**
     * 声明场次映射类的自动依赖注入
     * @param: 
     * @return: 
     */
    @Autowired
    private SessionMapper sessionMapper;

    /**
     * 实现获得所有场次数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Session>
     */
    @Cacheable(value = "sessionAll")
    @Override
    public List<Session> getAll() {
        return sessionMapper.getAll();
    }

    /**
     * 实现分页获取场次数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Session>
     */
    @Cacheable(value = "sessionPage")
    @Override
    public List<Session> getByPage() {
        return sessionMapper.getByPage();
    }

    /**
     * 实现获得一个场次数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Session
     */
    @Cacheable(value = "sessionOne", key = "#id.toString()")
    @Override
    public Session getOne(Integer id) {
        return sessionMapper.getOne(id);
    }

    /**
     * 实现添加一个场次数据
     * @param: [session]
     * @return: void
     */
    @CachePut(value = "addSessionCache", key = "")
    @Override
    public void insert(Session session) {
        sessionMapper.insert(session);
    }

    /**
     * 实现更新一个场次数据
     * @param: [session]
     * @return: void
     */
    @CachePut(value = "updateSessionCache", key = "")
    @Override
    public void update(Session session) {
        sessionMapper.update(session);
    }

    /**
     * 实现删除一个场次数据
     * @param: [id]
     * @return: void
     */
    @CacheEvict(key = "#id.toString()")
    @Override
    public void deleteById(Integer id) {
        sessionMapper.deleteById(id);
    }

    /**
     * 实现删除所有场次数据
     * @param: []
     * @return: void
     */
    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() {
        sessionMapper.deleteAll();
    }
}
