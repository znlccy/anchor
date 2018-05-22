package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.mapper.CompanyMapper;
import com.youda.anchor.admin.model.Company;
import com.youda.anchor.admin.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/22-14:13
 * @Version: v1.0.0
 * @Comment: 公司服务实现类
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    /**
     * 声明公司映射类的自动依赖注入
     */
    @Autowired
    private CompanyMapper companyMapper;

    /**
     * 实现获取所有公司数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Company>
     */
    @Cacheable(value = "companyAll")
    @Override
    public List<Company> getAll() {
        return companyMapper.getAll();
    }

    /**
     * 实现分页获取公司数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Company>
     */
    @Cacheable(value = "companyPage")
    @Override
    public List<Company> getByPage() {
        return companyMapper.getByPage();
    }

    /**
     * 实现获取一个公司数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Company
     */
    @Cacheable(value = "companyOne", key = "#id.toString()")
    @Override
    public Company getOne(Integer id) {
        return companyMapper.getOne(id);
    }

    /**
     * 实现添加一个公司数据
     * @param: [company]
     * @return: void
     */
    @CachePut(value = "companyAdd", key = "")
    @Override
    public void insert(Company company) {
        companyMapper.insert(company);
    }

    /**
     * 实现更新一个公司数据
     * @param: [company]
     * @return: void
     */
    @CachePut(value = "companyUpdate", key = "")
    @Override
    public void update(Company company) {
        companyMapper.update(company);
    }

    /**
     * 实现删除一个公司数据
     * @param: [id]
     * @return: void
     */
    @CacheEvict(key = "#id.toString()")
    @Override
    public void deleteById(Integer id) {
        companyMapper.deleteById(id);
    }

    /**
     * 实现删除所有公司数据
     * @param: []
     * @return: void
     */
    @CacheEvict(allEntries = true)
    @Override
    public void deleteAll() {
        companyMapper.deleteAll();
    }
}
