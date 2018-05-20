package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.mapper.ConfigMapper;
import com.youda.anchor.admin.model.Config;
import com.youda.anchor.admin.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/20-16:11
 * @Version: v1.0.0
 * @Comment: 配置服务接口实现类
 */
@Service
public class ConfigServiceImpl implements ConfigService {

    /**
     * 声明配置映射类自动依赖注入
     */
    @Autowired
    private ConfigMapper configMapper;

    /**
     * 实现获得所有配置信息
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Config>
     */
    @Override
    public List<Config> getAll() {
        return null;
    }

    /**
     * 实现分页获得配置信息
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Config>
     */
    @Override
    public List<Config> getByPage() {
        return null;
    }

    /**
     * 实现获得一个配置信息
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Config
     */
    @Override
    public Config getOne(Integer id) {
        return null;
    }

    /**
     * 实现添加一个配置信息
     * @param: [config]
     * @return: void
     */
    @Override
    public void insert(Config config) {

    }

    /**
     * 实现更新一个配置信息
     * @param: [config]
     * @return: void
     */
    @Override
    public void update(Config config) {

    }

    /**
     * 实现删除一个配置信息
     * @param: [id]
     * @return: void
     */
    @Override
    public void deleteById(Integer id) {

    }

    /**
     * 实现删除所有配置信息
     * @param: []
     * @return: void
     */
    @Override
    public void deleteAll() {

    }
}
