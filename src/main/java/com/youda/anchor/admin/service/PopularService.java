package com.youda.anchor.admin.service;

import com.youda.anchor.admin.model.Popular;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/14-14:36
 * @Version: v1.0.0
 * @Comment: 人气服务接口类
 */
public interface PopularService {

    /**
     * 声明获得所有人气数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Popular>
     */
    List<Popular> getAll();

    /**
     * 声明分页获得人气数据
     * @param: [pageNum, pageSize]
     * @return: java.util.List<com.youda.anchor.admin.model.Popular>
     */
    List<Popular> getByPage(int pageNum, int pageSize);

    /**
     * 声明获得一个人气数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Popular
     */
    Popular getOne(Integer id);

    /**
     * 声明获得一个人气
     * @param: [popular]
     * @return: void
     */
    void insert(Popular popular);

    /**
     * 声明更新一个人气
     * @param: [popular]
     * @return: void
     */
    void update(Popular popular);

    /**
     * 声明删除一个人气
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 声明删除所有人气数据
     * @param: []
     * @return: void
     */
    void deleteAll();

}
