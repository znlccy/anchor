package com.youda.anchor.admin.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.youda.anchor.admin.mapper.PopularMapper;
import com.youda.anchor.admin.model.Popular;
import com.youda.anchor.admin.service.PopularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/14-14:40
 * @Version: v1.0.0
 * @Comment: 人气服务接口实现类
 */
@Service
public class PopularServiceImpl implements PopularService {

    /**
     * 实现人气映射类的自动依赖注入
     */
    @Autowired
    private PopularMapper popularMapper;

    /**
     * 实现获得所有人气数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Popular>
     */
    /*@Cacheable(value = "popularAll")*/
    @Override
    public List<Popular> getAll(){
        return popularMapper.getAll();
    }

    /**
     * 实现分页获得人气数据
     * @param: [pageNum, pageSize]
     * @return: java.util.List<com.youda.anchor.admin.model.Popular>
     */
    /*@Cacheable(value = "popularPage")*/
    @Override
    public List<Popular> getByPage(int pageNum, int pageSize)  {
        PageHelper.startPage(pageNum, pageSize);
        List<Popular> populars = popularMapper.getByPage();
        return populars;
    }

    /**
     * 实现获得一个人气数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Popular
     */
    @Cacheable(key = "#id.toString()", value = "popularOne")
    @Override
    public Popular getOne(Integer id) {
        return popularMapper.getOne(id);
    }

    /**
     * 实现添加一个人气数据
     * @param: [popular]
     * @return: void
     */
    @CachePut(value = "popularInsert", key = "popular")
    @Override
    public void insert(Popular popular) {
        popularMapper.insert(popular);
    }

    /**
     * 实现更新一个人气数据
     * @param: [popular]
     * @return: void
     */
    @CachePut(value = "popularUpdate", key = "popular")
    @Override
    public void update(Popular popular) {
        popularMapper.update(popular);
    }

    /**
     * 实现删除一个人气数据
     * @param: [id]
     * @return: void
     */
    @CacheEvict(key = "#id.toString()")
    @Override
    public void deleteById(Integer id) {
        popularMapper.deleteById(id);
    }

    /**
     * 实现删除所有人气数据
     * @param: []
     * @return: void
     */
    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() {
        popularMapper.deleteAll();
    }
}
