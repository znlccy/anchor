package com.youda.anchor.admin.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-10:54
 * @Version: v1.0.0
 * @Comment: 礼物详情
 */
public class GiftDetail implements Serializable {

    /**
     * 声明礼物详情主键
     */
    private Integer id;

    /**
     * 声明礼物名称
     */
    private String name;

    /**
     * 声明礼物详情图标
     */
    private String icon;

    /**
     * 声明平台价格
     */
    private BigDecimal platformprice;

    /**
     * 声明实际价格
     */
    private BigDecimal realprice;

    /**
     * 声明状态
     */
    private String status;

    /**
     * 声明平台主键
     */
    private Integer pid;

    /**
     * 实现获得礼物详情主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置礼物平台主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 实现获得礼物详情图标
     * @param: []
     * @return: java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * 实现设置礼物详情图标
     * @param: [name]
     * @return: void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 实现获得礼物详情图标
     * @param: []
     * @return: java.lang.String
     */
    public String getIcon() {
        return icon;
    }
    
    /**
     * 实现设置礼物详情图标
     * @param: [icon]
     * @return: void
     */
    public void setIcon(String icon) {
        this.icon = icon;
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

    /**
     * 实现获得状态
     * @param: []
     * @return: java.lang.String
     */
    public String getStatus() {
        return status;
    }

    /**
     * 实现设置状态
     * @param: [status]
     * @return: void
     */
    public void setStatus(String status) {
        this.status = status;
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
}
