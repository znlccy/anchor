package com.youda.anchor.admin.download;

import com.youda.anchor.admin.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-11:32
 * @Version: v1.0.0
 * @Comment: 下载控制器
 */
@RestController
@RequestMapping(value = "/file")
public class DownloadController {

    /**
     * 声明下载服务的自动依赖注入
     */
    @Autowired
    private DownloadService downloadService;

    @RequestMapping(value = "/download")
    public String download(HttpServletRequest request, HttpServletResponse response) {
        return downloadService.download(request, response);
    }
}
