package com.youda.anchor.admin.mapper;

import com.github.pagehelper.Page;
import com.youda.anchor.admin.model.Config;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/20-14:09
 * @Version: v1.0.0
 * @Comment: 配置映射类
 */
@Mapper
public interface ConfigMapper {

    /**
     * 声明获得所有配置信息
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Config>
     */
    List<Config> getAll();

    /**
     * 声明分页获得配置信息
     * @param: []
     * @return: com.github.pagehelper.Page<com.youda.anchor.admin.model.Config>
     */
    Page<Config> getByPage();

    /**
     * 声明获得一个配置信息
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Config
     */
    Config getOne(Integer id);

    /**
     * 声明添加一个配置信息
     * @param: [config]
     * @return: void
     */
    void insert(Config config);

    /**
     * 声明更新一个配置信息
     * @param: [config]
     * @return: void
     */
    void update(Config config);

    /**
     * 声明删除一个配置信息
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 声明删除所有配置信息
     * @param: []
     * @return: void
     */
    void deleteAll();
}
