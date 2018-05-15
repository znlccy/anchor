package com.youda.anchor.admin.mapper;

import com.youda.anchor.admin.model.Anchor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/10-9:28
 * @Version: v1.0.0
 * @Comment: 主播映射
 */
@Mapper
public interface AnchorMapper {

    /**
     * 获取所有主播
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Anchor>
     */
    List<Anchor> getAll();

    /**
     * 分页获取主播
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Anchor>
     */
    List<Anchor> getByPage();

    /**
     * 获取一个主播
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Anchor
     */
    Anchor getOne(Integer id);

    /**
     * 实现添加主播
     * @param: [anchor]
     * @return: void
     */
    void insert(Anchor anchor);

    /**
     * 实现更新主播
     * @param: [anchor]
     * @return: void
     */
    void update(Anchor anchor);
    
    /**
     * 实现删除主播
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 删除所有主播数据
     * @param: []
     * @return: void
     */
    void deleteAll();
}
