package com.youda.anchor.admin.mapper;

import com.youda.anchor.admin.model.Speak;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/7-14:02
 * @Version: v1.0.0
 * @Comment: 发言映射类
 */

@Mapper
public interface SpeakMapper {

    /**
     * 声明获取所有的发言数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Speak>
     */
    List<Speak> getAll();
    
    /**
     * 声明通过主键获取一条发言数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Speak
     */
    Speak getOne(Integer id);

    /**
     * 声明添加发言数据
     * @param: [speak]
     * @return: void
     */
    void insert(Speak speak);

    /**
     * 声明更新发言数据
     * @param: [speak]
     * @return: void
     */
    void update(Speak speak);

    /**
     * 声明通过主键删除发言数据
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);


}
