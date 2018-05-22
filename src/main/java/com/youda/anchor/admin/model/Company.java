package com.youda.anchor.admin.model;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/10-14:17
 * @Version: v1.0.0
 * @Comment: 公司实体类
 */
public class Company implements Serializable {

    /**
     * 声明公司主键
     */
    private Integer id;

    /**
     * 声明公司名称
     */
    private String name;

    /**
     * 声明主播数量
     */
    private Integer anchornum;

    /**
     * 声明公司等级
     */
    private String grade;

    /**
     * 声明公司过期时间
     */
    private Timestamp expired;

    /**
     * 声明公司状态
     */
    private String status;

    /**
     * 声明公司商务经理
     */
    private String manager;

    /**
     * 声明公司电话
     */
    private String cellphone;

    /**
     * 声明公司介绍
     */
    private String introduce;

    /**
     * 声明公司连接
     */
    private String link;

    /**
     * 声明公司密码
     */
    private String password;

    /**
     * 声明公司分组
     */
    private String group;

    /**
     * 声明公司法人
     */
    private String legalperson;

    /**
     * 声明公司注册地址
     */
    private String registeredaddress;

    /**
     * 声明公司营业执照
     */
    private String businesslicense;

    /**
     * 实现获得公司主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置公司主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 实现获得公司名称
     * @param: []
     * @return: java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * 实现设置公司名称
     * @param: [name]
     * @return: void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 实现获得主播数量
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getAnchornum() {
        return anchornum;
    }

    /**
     * 实现设置主播数量
     * @param: [anchornum]
     * @return: void
     */
    public void setAnchornum(Integer anchornum) {
        this.anchornum = anchornum;
    }

    /**
     * 实现获得公司等级
     * @param: []
     * @return: java.lang.String
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 实现设置公司等级
     * @param: [grade]
     * @return: void
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 实现获得公司过期时间
     * @param: []
     * @return: java.sql.Timestamp
     */
    public Timestamp getExpired() {
        return expired;
    }

    /**
     * 实现设置公司过期时间
     * @param: [expired]
     * @return: void
     */
    public void setExpired(Timestamp expired) {
        this.expired = expired;
    }
    
    /**
     * 实现获得公司状态
     * @param: []
     * @return: java.lang.String
     */
    public String getStatus() {
        return status;
    }

    /**
     * 实现设置公司状态
     * @param: [status]
     * @return: void
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 实现获得公司商务经理
     * @param: []
     * @return: java.lang.String
     */
    public String getManager() {
        return manager;
    }

    /**
     * 实现获得商务经理
     * @param: [manager]
     * @return: void
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * 实现获得公司电话
     * @param: []
     * @return: java.lang.String
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * 实现设置公司电话
     * @param: [cellphone]
     * @return: void
     */
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    /**
     * 实现获得公司介绍
     * @param: []
     * @return: java.lang.String
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * 实现设置公司介绍
     * @param: [introduce]
     * @return: void
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**
     * 实现获得公司连接
     * @param: []
     * @return: java.lang.String
     */
    public String getLink() {
        return link;
    }

    /**
     * 实现设置公司连接
     * @param: [link]
     * @return: void
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 实现获得公司密码
     * @param: []
     * @return: java.lang.String
     */
    public String getPassword() {
        return password;
    }

    /**
     * 实现设置公司密码
     * @param: [password]
     * @return: void
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 实现获得公司分组
     * @param: []
     * @return: java.lang.String
     */
    public String getGroup() {
        return group;
    }

    /**
     * 实现设置公司分组
     * @param: [group]
     * @return: void
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * 实现获得公司法人
     * @param: []
     * @return: java.lang.String
     */
    public String getLegalperson() {
        return legalperson;
    }

    /**
     * 实现设置公司法人
     * @param: [legalperson]
     * @return: void
     */
    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    /**
     * 实现获得公司注册地址
     * @param: []
     * @return: java.lang.String
     */
    public String getRegisteredaddress() {
        return registeredaddress;
    }

    /**
     * 实现设置公司注册地址
     * @param: [registeredaddress]
     * @return: void
     */
    public void setRegisteredaddress(String registeredaddress) {
        this.registeredaddress = registeredaddress;
    }

    /**
     * 实现获得公司营业执照
     * @param: []
     * @return: java.lang.String
     */
    public String getBusinesslicense() {
        return businesslicense;
    }

    /**
     * 实现设置公司营业执照
     * @param: [businesslicense]
     * @return: void
     */
    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense;
    }
}
