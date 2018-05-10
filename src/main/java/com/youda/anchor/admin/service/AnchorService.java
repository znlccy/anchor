package com.youda.anchor.admin.service;

import com.youda.anchor.admin.model.Anchor;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/4/23-16:53
 * @Version: v1.0.0
 * @Comment: 主播服务接口类
 */
public interface AnchorService {

    /**
     * 声明获取所有主播
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Anchor>
     */
    List<Anchor> getAll();

    /**
     * 声明获取一个主播
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Anchor
     */
    Anchor getOne(Integer id);

    /**
     * 声明添加主播
     * @param: [anchor]
     * @return: void
     */
    void insert(Anchor anchor);

    /**
     * 声明更新主播
     * @param: [anchor]
     * @return: void
     */
    void update(Anchor anchor);

    /**
     * 声明删除主播
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 声明删除所有主播
     */
    void deleteAll();
}
