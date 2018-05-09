package com.youda.anchor.admin.controller;

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
     * 获取所有发言数据
     * @param: []
     * @return: java.util.List<com.youda.anchor.admin.model.Speak>
     */
    @GetMapping(value = "/all")
    public List<Speak> getAll() {
        List<Speak> speaks = speakService.getAll();
        return speaks;
    }

    /**
     * 删除一个发言数据
     * @param: [id]
     * @return: void
     */
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable("id") Integer id) {
        speakService.deleteById(id);
    }

    /**
     * 查询一个发言数据
     * @param: [id]
     * @return: com.youda.anchor.admin.model.Speak
     */
    @GetMapping(value = "/get/{id}")
    public Speak get(@PathVariable("id") Integer id) {
        return speakService.getOne(id);
    }

    /**
     * 添加发言数据
     * @param: [speak]
     * @return: void
     */
    @PostMapping(value = "/add")
    public void insert(@RequestBody Speak speak) {
        speakService.insert(speak);
    }

    /**
     * 更新发言数据
     * @param: [speak]
     * @return: void
     */
    @PutMapping(value = "/update")
    public void update(@RequestBody Speak speak) {
        speakService.update(speak);
    }

}
