package com.youda.anchor.admin.serviceImpl;

import com.youda.anchor.admin.mapper.SpeakMapper;
import com.youda.anchor.admin.model.Speak;
import com.youda.anchor.admin.service.SpeakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/7-17:42
 * @Version: v1.0.0
 * @Comment: 发言数据服务实现类
 */
@Service
public class SpeakServiceImpl implements SpeakService {

    @Autowired
    private SpeakMapper speakMapper;

    @Override
    public List<Speak> getAll() {
        return speakMapper.getAll();
    }

    @Override
    public Speak getOne(Integer id) {
        return null;
    }

    @Override
    public void insert(Speak speak) {

    }

    @Override
    public void update(Speak speak) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
