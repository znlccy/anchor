package com.youda.anchor.admin.model;

import io.swagger.models.auth.In;

import java.math.BigDecimal;
import java.sql.Time;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/20-10:16
 * @Version: v1.0.0
 * @Comment: 详情配置
 */
public class Detail {

    /**
     * 声明详情主键
     */
    private Integer id;

    /**
     * 声明时间
     */
    private Time time;

    /**
     * 声明平台主键
     */
    private Integer pid;

    /**
     * 声明主播主键
     */
    private Integer aid;

    /**
     * 声明用户名
     */
    private String username;

    /**
     * 声明内容
     */
    private String content;

    /**
     * 声明平台价格
     */
    private BigDecimal platformprice;

    /**
     * 声明真实价格
     */
    private BigDecimal realprice;

    /**
     * 实现获得详情主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置详情主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 实现获得时间
     * @param: []
     * @return: java.sql.Time
     */
    public Time getTime() {
        return time;
    }

    /**
     * 实现设置时间
     * @param: [time]
     * @return: void
     */
    public void setTime(Time time) {
        this.time = time;
    }

    /**
     * 实现获得平台主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 实现设置平台主键
     * @param: [pid]
     * @return: void
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 实现获得主播主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 实现设置主播主键
     * @param: [aid]
     * @return: void
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 实现获得用户名
     * @param: []
     * @return: java.lang.String
     */
    public String getUsername() {
        return username;
    }

    /**
     * 实现设置用户名
     * @param: [username]
     * @return: void
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 实现获得内容
     * @param: []
     * @return: java.lang.String
     */
    public String getContent() {
        return content;
    }

    /**
     * 实现设置内容
     * @param: [content]
     * @return: void
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 实现获得平台价格
     * @param: []
     * @return: java.math.BigDecimal
     */
    public BigDecimal getPlatformprice() {
        return platformprice;
    }

    /**
     * 实现设置平台价格
     * @param: [platformprice]
     * @return: void
     */
    public void setPlatformprice(BigDecimal platformprice) {
        this.platformprice = platformprice;
    }

    /**
     * 实现获得真实价格
     * @param: []
     * @return: java.math.BigDecimal
     */
    public BigDecimal getRealprice() {
        return realprice;
    }

    /**
     * 实现设置真实价格
     * @param: [realprice]
     * @return: void
     */
    public void setRealprice(BigDecimal realprice) {
        this.realprice = realprice;
    }
}
