package com.youda.anchor.admin.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/22-10:45
 * @Version: v1.0.0
 * @Comment: 场次实体类
 */
public class Session implements Serializable {

    /**
     * 声明场次主键
     */
    private Integer id;

    /**
     * 声明场次开始时间
     */
    private Timestamp begintime;

    /**
     * 声明场次结束时间
     */
    private Timestamp endtime;

    /**
     * 声明平台主键
     */
    private Integer pid;

    /**
     * 声明主播主键
     */
    private Integer aid;

    /**
     * 声明在线时长
     */
    private String livetime;

    /**
     * 声明礼物价值
     */
    private BigDecimal giftvalue;

    /**
     * 声明发送礼物数
     */
    private Integer sendgift;

    /**
     * 声明弹幕数
     */
    private Integer barrage;

    /**
     * 声明弹幕人数
     */
    private Integer barragepeople;

    /**
     * 声明订阅人数
     */
    private Integer subscribe;

    /**
     * 实现获得场次主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置场次主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 实现获得开始时间
     * @param: []
     * @return: java.sql.Timestamp
     */
    public Timestamp getBegintime() {
        return begintime;
    }

    /**
     * 实现设置开始时间
     * @param: [begintime]
     * @return: void
     */
    public void setBegintime(Timestamp begintime) {
        this.begintime = begintime;
    }

    /**
     * 实现获得结束时间
     * @param: []
     * @return: java.sql.Timestamp
     */
    public Timestamp getEndtime() {
        return endtime;
    }

    /**
     * 实现设置结束时间
     * @param: [endtime]
     * @return: void
     */
    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
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
     * 实现获得在线时长
     * @param: []
     * @return: java.lang.String
     */
    public String getLivetime() {
        return livetime;
    }

    /**
     * 实现设置在线时长
     * @param: [livetime]
     * @return: void
     */
    public void setLivetime(String livetime) {
        this.livetime = livetime;
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
     * 实现获得发送礼物价值
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getSendgift() {
        return sendgift;
    }

    /**
     * 实现设置发送礼物价值
     * @param: [sendgift]
     * @return: void
     */
    public void setSendgift(Integer sendgift) {
        this.sendgift = sendgift;
    }

    /**
     * 实现获得弹幕数
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getBarrage() {
        return barrage;
    }

    /**
     * 实现设置弹幕数
     * @param: [barrage]
     * @return: void
     */
    public void setBarrage(Integer barrage) {
        this.barrage = barrage;
    }

    /**
     * 实现获得弹幕人数
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getBarragepeople() {
        return barragepeople;
    }

    /**
     * 实现设置弹幕人数
     * @param: [barragepeople]
     * @return: void
     */
    public void setBarragepeople(Integer barragepeople) {
        this.barragepeople = barragepeople;
    }

    /**
     * 实现获得订阅数
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getSubscribe() {
        return subscribe;
    }

    /**
     * 实现设置订阅数
     * @param: [subscribe]
     * @return: void
     */
    public void setSubscribe(Integer subscribe) {
        this.subscribe = subscribe;
    }
}
