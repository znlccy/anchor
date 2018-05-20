package com.youda.anchor.admin.serviceImpl;


import com.youda.anchor.admin.mapper.AdminLogMapper;
import com.youda.anchor.admin.model.AdminLog;
import com.youda.anchor.admin.service.AdminLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/17-16:01
 * @Version: v1.0.0
 * @Comment: 管理员日志服务接口实现类
 */
@Service
public class AdminLogServiceImpl implements AdminLogService {

    /**
     * 声明管理员日志映射的自动依赖注入
     */
    @Autowired
    private AdminLogMapper adminLogMapper;

    /**
     * 实现获得所有管理员
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.AdminLog>
     */
    @Override
    public List<AdminLog> getAll() {
        return null;
    }

    /**
     * 实现分页获得管理员日志
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.AdminLog>
     */
    @Override
    public List<AdminLog> getPage() {
        return null;
    }

    /**
     * 实现获得一个管理员日志
     * @param: [id]
     * @return: com.youda.anchor.admin.model.AdminLog
     */
    @Override
    public AdminLog getOne(Integer id) {
        return null;
    }

    /**
     * 实现添加一个管理员日志
     * @param: [adminLog]
     * @return: void
     */
    @Override
    public void insert(AdminLog adminLog) {

    }

    /**
     * 实现更新一个管理员日志
     * @param: [adminLog]
     * @return: void
     */
    @Override
    public void update(AdminLog adminLog) {

    }

    /**
     * 实现删除一个管理员日志
     * @param: [id]
     * @return: void
     */
    @Override
    public void deleteById(Integer id) {

    }

    /**
     * 实现删除所有管理员日志
     * @param: []
     * @return: void
     */
    @Override
    public void deleteAll() {

    }
}
