package com.youda.anchor.admin.mapper;

import com.github.pagehelper.Page;
import com.youda.anchor.admin.model.Platform;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/13-17:45
 * @Version: v1.0.0
 * @Comment: 平台映射类
 */
@Mapper
public interface PlatformMapper {

    /**
     * 声明查询所有平台数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Platform>
     */
    List<Platform> getAll() throws Exception;

    /**
     * 声明通过分页查询平台数据
     * @param: []
     * @return: com.github.pagehelper.Page<com.youda.anchor.admin.model.Platform>
     */
    Page<Platform> getByPage() throws Exception;

    /**
     * 声明查询单个平台数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Platform
     */
    Platform getOne(Integer id) throws Exception;

    /**
     * 声明添加一个平台数据
     * @param: [platform]
     * @return: void
     */
    void insert(Platform platform) throws Exception;

    /**
     * 声明更新一个平台数据
     * @param: [platform]
     * @return: void
     */
    void update(Platform platform) throws Exception;

    /**
     * 声明通过主键删除一个平台数据
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id) throws Exception;

    /**
     * 声明删除所有数据
     * @param: []
     * @return: void
     */
    void deleteAll() throws Exception;

}
