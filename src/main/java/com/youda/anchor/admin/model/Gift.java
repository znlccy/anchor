package com.youda.anchor.admin.model;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/10-14:33
 * @Version: v1.0.0
 * @Comment: 礼物实体类
 */
public class Gift implements Serializable {

    /**
     * 声明礼物主键
     */
    private Integer id;

    /**
     * 声明礼物日期
     */
    private Date date;

    /**
     * 声明礼物时间
     */
    private Time hour;

    /**
     * 声明平台主键
     */
    private Integer pid;

    /**
     * 声明主播主键
     */
    private Integer aid;

    /**
     * 声明发送礼物数量
     */
    private Integer sendgift;

    /**
     * 声明礼物数量
     */
    private Integer giftnum;

    /**
     * 声明礼物价值
     */
    private BigDecimal giftvalue;

    /**
     * 声明最大礼物
     */
    private BigDecimal maxgift;

    /**
     * 声明真实价格
     */
    private BigDecimal realprice;

    /**
     * 实现获取礼物主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置礼物主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 实现获取礼物日期
     * @param: []
     * @return: java.sql.Date
     */
    public Date getDate() {
        return date;
    }

    /**
     * 实现设置礼物日期
     * @param: [date]
     * @return: void
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 实现获取礼物时间
     * @param: []
     * @return: java.sql.Time
     */
    public Time getHour() {
        return hour;
    }

    /**
     * 实现设置礼物时间
     * @param: [time]
     * @return: void
     */
    public void setHour(Time hour) {
        this.hour = hour;
    }

    /**
     * 实现获取平台主键
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
     * 实现获取主播主键
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
     * 实现获取发送礼物
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getSendgift() {
        return sendgift;
    }

    /**
     * 实现设置发送礼物
     * @param: [sendgift]
     * @return: void
     */
    public void setSendgift(Integer sendgift) {
        this.sendgift = sendgift;
    }

    /**
     * 实现获取礼物数量
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getGiftnum() {
        return giftnum;
    }

    /**
     * 实现设置礼物数量
     * @param: [giftnum]
     * @return: void
     */
    public void setGiftnum(Integer giftnum) {
        this.giftnum = giftnum;
    }

    /**
     * 实现获得礼物价值
     * @param: []
     * @return: java.math.BigDecimal
     */
    public BigDecimal getGiftvalue() {
        return giftvalue;
    }

    /**
     * 实现设置礼物价值
     * @param: [giftvalue]
     * @return: void
     */
    public void setGiftvalue(BigDecimal giftvalue) {
        this.giftvalue = giftvalue;
    }

    /**
     * 实现获取最高礼物
     * @param: []
     * @return: java.math.BigDecimal
     */
    public BigDecimal getMaxgift() {
        return maxgift;
    }

    /**
     * 实现设置最高礼物
     * @param: [maxgift]
     * @return: void
     */
    public void setMaxgift(BigDecimal maxgift) {
        this.maxgift = maxgift;
    }

    /**
     * 事先获得真实价值
     * @param: []
     * @return: java.math.BigDecimal
     */
    public BigDecimal getRealprice() {
        return realprice;
    }

    /**
     * 实现设置真实价值
     * @param: [realprice]
     * @return: void
     */
    public void setRealprice(BigDecimal realprice) {
        this.realprice = realprice;
    }
}
