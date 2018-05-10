package com.youda.anchor.admin.mapper;

import com.youda.anchor.admin.model.Gift;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/10-15:28
 * @Version: v1.0.0
 * @Comment: 礼物映射
 */
@Mapper
public interface GiftMapper {

    /**
     * 声明获得所有礼物
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Gift>
     */
    List<Gift> getAll();

    /**
     * 声明获得一个礼物
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Gift
     */
    Gift getOne(Integer id);

    /**
     * 声明添加一个礼物
     * @param: [gift]
     * @return: void
     */
    void insert(Gift gift);

    /**
     * 声明更新一个礼物
     * @param: [gift]
     * @return: void
     */
    void update(Gift gift);

    /**
     * 声明通过主键删除一个礼物
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 声明删除所有礼物数据
     * @param: []
     * @return: void
     */
    void deleteAll();

}
