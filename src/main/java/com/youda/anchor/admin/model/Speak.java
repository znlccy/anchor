package com.youda.anchor.admin.model;

import javax.persistence.Entity;
import java.io.Serializable;

public class Speak implements Serializable  {

    /**
     * 声明发言主键
     */
    private Integer id;

    /**
     * 声明弹幕人数
     */
    private Integer barragepeople;

    /**
     * 声明单数数量
     */
    private Integer barragenum;

    /**
     * 实现获得发言主键
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * 实现设置发言主键
     * @param: [id]
     * @return: void
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 实现获得弹幕数量
     * @param: []
     * @return: java.lang.Integer
     */
    public Integer getBarragenum() {
        return barragenum;
    }

    /**
     * 实现设置弹幕数量
     * @param: [barragenum]
     * @return: void
     */
    public void setBarragenum(Integer barragenum) {
        this.barragenum = barragenum;
    }
}
