package com.youda.anchor.admin.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-11:35
 * @Version: v1.0.0
 * @Comment: 文件下载服务
 */
public interface DownloadService {

    /**
     * 声明下载方法
     * @param: [request, response]
     * @return: java.lang.String
     */
    String download(HttpServletRequest request, HttpServletResponse response);

}
