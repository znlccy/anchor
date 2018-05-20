package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.mapper.DetailMapper;
import com.youda.anchor.admin.model.Detail;
import com.youda.anchor.admin.service.DetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/20-11:18
 * @Version: v1.0.0
 * @Comment: 详情服务接口实现类
 */
@Service
public class DetailServiceImpl implements DetailService {

    /**
     * 声明详情映射类
     */
    @Autowired
    private DetailMapper detailMapper;

    /**
     * 实现获得所有详情数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Detail>
     */
    @Override
    public List<Detail> getAll() {
        return null;
    }

    /**
     * 实现分页获得详情数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Detail>
     */
    @Override
    public List<Detail> getByPage() {
        return null;
    }

    /**
     * 实现获得一个详情数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Detail
     */
    @Override
    public Detail getOne(Integer id) {
        return null;
    }

    /**
     * 实现添加一个详情
     * @param: [detail]
     * @return: void
     */
    @Override
    public void insert(Detail detail) {

    }

    /**
     * 实现更新一个详情
     * @param: [detail]
     * @return: void
     */
    @Override
    public void update(Detail detail) {

    }

    /**
     * 实现删除一个详情
     * @param: [id]
     * @return: void
     */
    @Override
    public void deleteById(Integer id) {

    }

    /**
     * 实现删除所有详情
     * @param: []
     * @return: void
     */
    @Override
    public void deletaAll() {

    }
}
