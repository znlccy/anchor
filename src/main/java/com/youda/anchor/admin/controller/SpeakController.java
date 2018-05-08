package com.youda.anchor.admin.controller;

import com.youda.anchor.admin.mapper.SpeakMapper;
import com.youda.anchor.admin.model.Speak;
import com.youda.anchor.admin.service.SpeakService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/speak")
public class SpeakController {

    /**
     * 实现发言映射类的自动依赖注入
     */
    @Autowired
    private SpeakService speakService;

    /**
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Speak>
     */
    @GetMapping(value = "/all")
    public List<Speak> getAll() {
        List<Speak> speaks = speakService.getAll();
        return speaks;
    }

    /**
     * @param: [id]
     * @return: void
     */
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        speakService.deleteById(id);
    }

    /**
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Speak
     */
    @GetMapping(value = "/one/{id}")
    public Speak getOne(@PathVariable("id") Integer id) {
        return speakService.getOne(id);
    }

}
