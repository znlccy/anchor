package com.youda.anchor.admin.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-11:33
 * @Version: v1.0.0
 * @Comment: 上传服务
 */
public interface UploadService {

    /**
     * 声明单文件上传
     * @param: [file]
     * @return: java.lang.String
     */
    String upload(MultipartFile file);

    /**
     * 声明多文件上传
     * @param: [request]
     * @return: java.lang.String
     */
    String multiUpload(HttpServletRequest request);
}
