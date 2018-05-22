package com.youda.anchor.admin.service;

import com.youda.anchor.admin.model.Company;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/22-14:03
 * @Version: v1.0.0
 * @Comment: 公司映射类
 */
public interface CompanyService {

    /**
     * 声明获取所有公司数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Company>
     */
    List<Company> getAll();

    /**
     * 声明分页获取公司数据
     * @param: []
     * @return: com.github.pagehelper.Page<com.youda.anchor.admin.model.Company>
     */
    List<Company> getByPage();

    /**
     * 声明获取一个公司数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Company
     */
    Company getOne(Integer id);

    /**
     * 声明添加一个公司数据
     * @param: [company]
     * @return: void
     */
    void insert(Company company);

    /**
     * 声明更新一个公司数据
     * @param: [company]
     * @return: void
     */
    void update(Company company);

    /**
     * 声明删除一个公司数据
     * @param: [id]
     * @return: void
     */
    void deleteById(Integer id);

    /**
     * 声明删除所有公司数据
     * @param: []
     * @return: void
     */
    void deleteAll();
}
