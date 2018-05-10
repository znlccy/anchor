package com.youda.anchor.admin.model;

import java.io.Serializable;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/10-10:33
 * @Version: v1.0.0
 * @Comment: 主播实体类
 */
public class Anchor implements Serializable {

    /**
     * 声明主播主键
     */
    private Integer id;

    /**
     * 声明参照平台主键
     */
    private Integer pid;

    /**
     * 声明所属公司主键
     */
    private Integer cid;

    /**
     * 声明主播昵称
     */
    private String nickname;

    /**
     * 声明主播手机
     */
    private String mobile;

    /**
     * 声明主播密码
     */
    private String password;

    /**
     * 声明主播分类
     */
    private String category;

    /**
     * 声明主播联系方式
     */
    private String link;

    /**
     * 声明主播头像
     */
    private String avatar;

    /**
     * 声明主播房间地址
     */
    private Integer roomid;

    /**
     * 声明主播地址
     */
    private String liveurl;

    /**
     * 声明主播状态
     */
    private String livestatus;

    /**
     * 声明主播签约工会
     */
    private String sign;

    /**
     * 声明主播账号
     */
    private String account;

    /**
     * 声明主播状态
     */
    private String status;

    /**
     * 声明主播备注
     */
    private String remark;

    /**
     * 声明主播分组
     */
    private String group;

    /**
     * 实现获取主播主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置主播主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 实现获取所属公司主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 实现设置所属公司主键
     * @param: [cid]
     * @return: void
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 实现获取主播昵称
     * @param: []
     * @return: java.lang.String
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * 实现设置主播昵称
     * @param: [nickname]
     * @return: void
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    /**
     * 实现获取主播手机号
     * @param: []
     * @return: java.lang.String
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 实现设置主播
     * @param: [mobile]
     * @return: void
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 实现获取主播密码
     * @param: []
     * @return: java.lang.String
     */
    public String getPassword() {
        return password;
    }

    /**
     * 实现设置主播密码
     * @param: [password]
     * @return: void
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 实现获取主播分类
     * @param: []
     * @return: java.lang.String
     */
    public String getCategory() {
        return category;
    }

    /**
     * 实现设置主播分类
     * @param: [category]
     * @return: void
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 实现获取主播联系方式
     * @param: []
     * @return: java.lang.String
     */
    public String getLink() {
        return link;
    }

    /**
     * 实现设置主播联系方式
     * @param: [link]
     * @return: void
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * 实现获取主播头像
     * @param: []
     * @return: java.lang.String
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 实现设置主播头像
     * @param: [avatar]
     * @return: void
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 实现获取主播房间ID
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getRoomid() {
        return roomid;
    }

    /**
     * 实现设置主播房间ID
     * @param: [roomid]
     * @return: void
     */
    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    /**
     * 实现获取主播连接
     * @param: []
     * @return: java.lang.String
     */
    public String getLiveurl() {
        return liveurl;
    }

    /**
     * 实现设置主播链接
     * @param: [liveurl]
     * @return: void
     */
    public void setLiveurl(String liveurl) {
        this.liveurl = liveurl;
    }

    /**
     * 实现获取主播直播状态
     * @param: []
     * @return: java.lang.String
     */
    public String getLivestatus() {
        return livestatus;
    }

    /**
     * 实现设置主播直播状态
     * @param: [livestatus]
     * @return: void
     */
    public void setLivestatus(String livestatus) {
        this.livestatus = livestatus;
    }

    /**
     * 实现获取主播签约工会
     * @param: []
     * @return: java.lang.String
     */
    public String getSign() {
        return sign;
    }

    /**
     * 实现设置主播签约工会
     * @param: [sign]
     * @return: void
     */
    public void setSign(String sign) {
        this.sign = sign;
    }

    /**
     * 实现获取主播账号
     * @param: []
     * @return: java.lang.String
     */
    public String getAccount() {
        return account;
    }

    /**
     * 实现设置主播账号
     * @param: [account]
     * @return: void
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 实现获取主播状态
     * @param: []
     * @return: java.lang.String
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * 实现设置主播状态
     * @param: [status]
     * @return: void
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 实现获取主播备注
     * @param: []
     * @return: java.lang.String
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 实现设置主播备注
     * @param: [remark]
     * @return: void
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 实现获取主播分组
     * @param: []
     * @return: java.lang.String
     */
    public String getGroup() {
        return group;
    }

    /**
     * 实现设置主播分组
     * @param: [group]
     * @return: void
     */
    public void setGroup(String group) {
        this.group = group;
    }
}
