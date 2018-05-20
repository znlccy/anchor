package com.youda.anchor.admin.model;

import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/17-11:15
 * @Version: v1.0.0
 * @Comment: 管理员账号
 */
public class AdminLog implements Serializable {

    /**
     * 声明管理员日志主键
     */
    private Integer id;

    /**
     * 声明管理员主键
     */
    private Integer admin_id;

    /**
     * 声明管理员名称
     */
    private String username;

    /**
     * 声明路径
     */
    private String url;

    /**
     * 声明标题
     */
    private String title;

    /**
     * 声明内容
     */
    private String content;

    /**
     * 声明IP地址
     */
    private String ip;

    /**
     * 声明用户代理
     */
    private String useragent;

    /**
     * 声明创建时间
     */
    private Integer createtime;

    /**
     * 实现获取主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 实现获得管理员主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getAdmin_id() {
        return admin_id;
    }

    /**
     * 实现设置管理员主键
     * @param: [admin_id]
     * @return: void
     */
    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
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
     * 实现获得路径
     * @param: []
     * @return: java.lang.String
     */
    public String getUrl() {
        return url;
    }

    /**
     * 实现设置路径
     * @param: [url]
     * @return: void
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 实现获得标题
     * @param: []
     * @return: java.lang.String
     */
    public String getTitle() {
        return title;
    }

    /**
     * 实现设置标题
     * @param: [title]
     * @return: void
     */
    public void setTitle(String title) {
        this.title = title;
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
     * 实现获得ip地址
     * @param: []
     * @return: java.lang.String
     */
    public String getIp() {
        return ip;
    }

    /**
     * 实现设置ip地址
     * @param: [ip]
     * @return: void
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * 实现获得用户代理
     * @param: []
     * @return: java.lang.String
     */
    public String getUseragent() {
        return useragent;
    }

    /**
     * 实现设置用户代理
     * @param: [useragent]
     * @return: void
     */
    public void setUseragent(String useragent) {
        this.useragent = useragent;
    }

    /**
     * 实现获得创建时间
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getCreatetime() {
        return createtime;
    }

    /**
     * 实现设置创建时间
     * @param: [createtime]
     * @return: void
     */
    public void setCreatetime(Integer createtime) {
        this.createtime = createtime;
    }
}
