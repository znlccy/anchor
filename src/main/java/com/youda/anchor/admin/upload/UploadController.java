package com.youda.anchor.admin.upload;

import com.youda.anchor.admin.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-11:28
 * @Version: v1.0.0
 * @Comment: 文件上传控制器
 */
@RestController
@RequestMapping(value = "/file")
public class UploadController {

    /**
     * 声明上传服务的自动依赖注入
     */
    @Autowired
    private UploadService uploadService;

    /**
     * 实现单文件上传
     * @param: [file]
     * @return: java.lang.String
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file) {
        return uploadService.upload(file);
    }

    /**
     * 实现多文件上传
     * @param: [request]
     * @return: java.lang.String
     */
    @RequestMapping(value = "/batch/upload")
    @ResponseBody
    public String multiUpload(HttpServletRequest request) {
        return uploadService.multiUpload(request);
    }

}
