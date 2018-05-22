package com.youda.anchor.admin.mapper;

import com.github.pagehelper.Page;
import com.youda.anchor.admin.model.Session;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/21-13:47
 * @Version: v1.0.0
 * @Comment: 场次映射类
 */
@Mapper
public interface SessionMapper {

    /**
     * 声明查询所有场次数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Session>
     */
    List<Session> getAll();

    /**
     * 声明分页查询场次数据
     * @param: []
     * @return: com.github.pagehelper.Page<com.youda.anchor.admin.model.Session>
     */
    Page<Session> getByPage();

    /**
     * 声明查询一个场次数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Session
     */
    Session getOne(Integer id);

    /**
     * 声明添加一个场次数据
     * @param: [session]
     * @return: void
     */
    void insert(Session session);

    /**
     * 声明更新一个场次数据
     * @param: [session]
     * @return: void
     */
    void update(Session session);

    /**
     * 声明删除一个场次数据
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 声明删除所有场次数据
     * @param: []
     * @return: void
     */
    void deleteAll();

}
