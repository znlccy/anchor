package com.youda.anchor.admin.mapper;

import com.github.pagehelper.Page;
import com.youda.anchor.admin.model.Detail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/20-11:05
 * @Version: v1.0.0
 * @Comment: 详情映射类
 */
@Mapper
public interface DetailMapper {

    /**
     * 实现获得所有详情数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Detail>
     */
    List<Detail> getAll();

    /**
     * 实现分页获得详情数据
     * @param: []
     * @return: com.github.pagehelper.Page<com.youda.anchor.admin.model.Detail>
     */
    Page<Detail> getByPage();

    /**
     * 实现获得单个详情数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Detail
     */
    Detail getOne(Integer id);

    /**
     * 实现添加一个详情数据
     * @param: [detail]
     * @return: void
     */
    void insert(Detail detail);

    /**
     * 实现更新一个详情数据
     * @param: [detail]
     * @return: void
     */
    void update(Detail detail);

    /**
     * 实现删除一个详情数据
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 实现删除所有详情数据
     * @param: []
     * @return: void
     */
    void deletaAll();
}
