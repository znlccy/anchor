package com.youda.anchor.admin.controller;

import com.youda.anchor.admin.mapper.SpeakMapper;
import com.youda.anchor.admin.model.Speak;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/speak")
public class SpeakController {

    /**
     * 实现发言映射类的自动依赖注入
     */
    @Autowired
    private SpeakMapper speakMapper;

    @RequestMapping(value = "/all")
    public List<Speak> getAll() {
        List<Speak> speaks = speakMapper.getAll();
        return speaks;
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        speakMapper.deleteById(id);
    }
}
