package com.youda.anchor.admin.model;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/20-14:10
 * @Version: v1.0.0
 * @Comment: 配置实体类
 */
public class Config {

    /**
     * 声明主键
     */
    private Integer id;

    /**
     * 声明变量名
     */
    private String name;

    /**
     * 声明分组
     */
    private String group;

    /**
     * 声明变量标题
     */
    private String title;

    /**
     * 声明标量描述
     */
    private String tip;

    /**
     * 声明类型
     */
    private String type;

    /**
     * 声明变量值
     */
    private String value;

    /**
     * 声明变量字典类型
     */
    private String content;

    /**
     * 声明验证规则
     */
    private String rule;

    /**
     * 声明扩展属性
     */
    private String extend;

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
     * 实现获得名称
     * @param: []
     * @return: java.lang.String
     */
    public String getName() {
        return name;
    }

    /**
     * 实现设置名称
     * @param: [name]
     * @return: void
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 实现获得组名
     * @param: []
     * @return: java.lang.String
     */
    public String getGroup() {
        return group;
    }

    /**
     * 实现设置组名
     * @param: [group]
     * @return: void
     */
    public void setGroup(String group) {
        this.group = group;
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
     * 实现获得变量描述
     * @param: []
     * @return: java.lang.String
     */
    public String getTip() {
        return tip;
    }

    /**
     * 实现设置变量描述
     * @param: [tip]
     * @return: void
     */
    public void setTip(String tip) {
        this.tip = tip;
    }

    /**
     * 实现获得变量类型
     * @param: []
     * @return: java.lang.String
     */
    public String getType() {
        return type;
    }

    /**
     * 实现设置变量类型
     * @param: [type]
     * @return: void
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 实现获得变量值
     * @param: []
     * @return: java.lang.String
     */
    public String getValue() {
        return value;
    }

    /**
     * 实现设置变量值
     * @param: [value]
     * @return: void
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 实现获得变量内容
     * @param: []
     * @return: java.lang.String
     */
    public String getContent() {
        return content;
    }

    /**
     * 实现设置变量内容
     * @param: [content]
     * @return: void
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 实现获得验证规则
     * @param: []
     * @return: java.lang.String
     */
    public String getRule() {
        return rule;
    }

    /**
     * 实现设置验证规则
     * @param: [rule]
     * @return: void
     */
    public void setRule(String rule) {
        this.rule = rule;
    }

    /**
     * 实现获得扩展属性
     * @param: []
     * @return: java.
     * lang.String
     */
    public String getExtend() {
        return extend;
    }

    /**
     * 实现设置扩展属性
     * @param: [extend]
     * @return: void
     */
    public void setExtend(String extend) {
        this.extend = extend;
    }
}
