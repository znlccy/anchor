package com.youda.anchor.admin.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.MultipartConfigElement;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/15-14:28
 * @Version: v1.0.0
 * @Comment: 文件上传下载配置类
 */
@Configuration
public class MultipartConfig {

    /**
     * 文件配置
     * @param: []
     * @return: javax.servlet.MultipartConfigElement
     */
    @Bean
    public MultipartConfigElement multipartConfigElement() {

        MultipartConfigFactory factory = new MultipartConfigFactory();
        //设置文件大小限制，超出此大小页面会抛处异常信息
        factory.setMaxFileSize("200MB"); //KB,MB
        //设置总上传数据总大小
        factory.setMaxRequestSize("800MB");
        // 设置文件临时文件夹路径
        // factory.setLocation("E://test//");
        // 如果文件大于这个值，将以文件的形式存储，如果小于这个值文件将存储在内存中，默认为0
        // factory.setMaxRequestSize(0);
        return factory.createMultipartConfig();
    }

}
