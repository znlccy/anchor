package com.youda.anchor.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/14-11:30
 * @Version: v1.0.0
 * @Comment: 异步配置
 */
@Configuration
@EnableAsync
public class AsyncConfig {

    /**
     * 声明核心线程池大小
     */
    private int corePoolSize = 10;

    /**
     * 声明最大线程池大小
     */
    private int maxPoolSize = 200;

    /**
     * 声明序列容量大小
     */
    private int queueCapacity = 10;

    /**
     * 任务执行器
     * @param: []
     * @return: java.util.concurrent.Executor
     */
    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.initialize();
        return executor;
    }
    
}
