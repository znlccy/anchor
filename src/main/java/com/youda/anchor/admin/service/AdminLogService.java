package com.youda.anchor.admin.service;

import com.youda.anchor.admin.model.AdminLog;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/17-16:01
 * @Version: v1.0.0
 * @Comment: 管理日志服务接口
 */
public interface AdminLogService {

    /**
     * 声明获得所有管理日志
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.AdminLog>
     */
    List<AdminLog> getAll();

    /**
     * 声明分页获得管理日志
     * @param: []
     * @return: com.github.pagehelper.Page<com.youda.anchor.admin.model.AdminLog>
     */
    List<AdminLog> getPage();

    /**
     * 实现获得一个管理日志
     * @param: [id]
     * @return: com.youda.anchor.admin.model.AdminLog
     */
    AdminLog getOne(Integer id);

    /**
     * 实现添加一个管理员日志
     * @param: [adminLog]
     * @return: void
     */
    void insert(AdminLog adminLog);

    /**
     * 实现更新一个管理员日志
     * @param: [adminLog]
     * @return: void
     */
    void update(AdminLog adminLog);

    /**
     * 实现删除一个管理员日志
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 实现删除所有管理员日志
     * @param: []
     * @return: void
     */
    void deleteAll();
}
