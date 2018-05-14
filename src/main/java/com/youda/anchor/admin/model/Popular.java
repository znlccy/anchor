package com.youda.anchor.admin.model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/14-14:41
 * @Version: v1.0.0
 * @Comment: 人气实体类
 */
public class Popular implements Serializable {

    /**
     * 声明人气主键
     */
    private Integer id;

    /**
     * 声明人气日期
     */
    private Date date;

    /**
     * 声明人气时间
     */
    private Time hour;

    /**
     * 声明人气平台
     */
    private Integer pid;

    /**
     * 声明人气主播
     */
    private Integer aid;

    /**
     * 声明人气描述
     */
    private int subscribe;

    /**
     * 声明人气在线数量
     */
    private int onlinenum;

    /**
     * 实现获得人气主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置人气主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 实现获得人气日期
     * @param: []
     * @return: java.sql.Date
     */
    public Date getDate() {
        return date;
    }

    /**
     * 实现设置人气日期
     * @param: [date]
     * @return: void
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 实现获得人气小时
     * @param: []
     * @return: java.sql.Time
     */
    public Time getHour() {
        return hour;
    }

    /**
     * 实现设置人气小时
     * @param: [hour]
     * @return: void
     */
    public void setHour(Time hour) {
        this.hour = hour;
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
     * 实现获取订阅数量
     * @param: []
     * @return: int
     */
    public int getSubscribe() {
        return subscribe;
    }

    /**
     * 实现设置订阅数量
     * @param: [subscribe]
     * @return: void
     */
    public void setSubscribe(int subscribe) {
        this.subscribe = subscribe;
    }

    /**
     * 实现获取在线数量
     * @param: []
     * @return: int
     */
    public int getOnlinenum() {
        return onlinenum;
    }

    /**
     * 实现设置在线数量
     * @param: [onlinenum]
     * @return: void
     */
    public void setOnlinenum(int onlinenum) {
        this.onlinenum = onlinenum;
    }
}
