package com.youda.anchor.admin.model;

import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/13-17:21
 * @Version: v1.0.0
 * @Comment: 平台实体类
 */
public class Platform implements Serializable {

    /**
     * 声明平台主键
     */
    private Integer id;

    /**
     * 声明平台名称
     */
    private String name;

    /**
     * 声明平台状态
     */
    private String status;

    /**
     * 实现获取平台主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置平台主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 实现获取平台名称
     * @param: []
     * @return: java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * 实现设置平台名称
     * @param: [name]
     * @return: void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 实现获取平台状态
     * @param: []
     * @return: java.lang.String
     */
    public String getStatus() {
        return status;
    }

    /**
     * 实现设置平台状态
     * @param: [status]
     * @return: void
     */
    public void setStatus(String status) {
        this.status = status;
    }
}
