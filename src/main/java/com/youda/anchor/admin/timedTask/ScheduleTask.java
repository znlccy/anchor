package com.youda.anchor.admin.timedTask;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/14-10:19
 * @Version: v1.0.0
 * @Comment: 定时任务,三个定时任务都已经执行，并且使同一个线程中串行执行，
 * 如果只有一个定时任务，这样做肯定没问题，当定时任务增多，如果一个任务卡死，会导致其他任务也无法执行,加一个@Async使不同的任务分部在不同的线程上
 * @Statement:
 * fixedRate：定义一个按一定频率执行的定时任务
 * fixedDelay：定义一个按一定频率执行的定时任务，与上面不同的是，改属性可以配合initialDelay， 定义该任务延迟执行时间。
 * cron：通过表达式来配置任务执行时间s
 */
@Component
public class ScheduleTask {

    /**
     * 每隔5秒执行一次
     */
    /*@Async
    @Scheduled(cron = "0/5 * * * * *")
    public void crawl() {
        System.out.println("当前时间" + System.currentTimeMillis());
    }*/

    /**
     * 每隔5秒执行一次
     */
    /*@Async
    @Scheduled(fixedRate = 5000)
    public void scheduleOne() {
        System.out.println("固定时间:" + System.currentTimeMillis());
    }*/

    /**
     * 延迟时间
     */
    /*@Async
    @Scheduled(fixedDelay = 5)
    public void scheduleTwo() {
        System.out.println("固定时间:" + System.currentTimeMillis());
    }*/
}
