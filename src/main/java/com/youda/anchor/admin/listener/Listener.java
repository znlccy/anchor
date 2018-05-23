package com.youda.anchor.admin.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;


/**
 * @Author: Administrator
 * @Datetime: 2018/5/23-11:26
 * @Version: v1.0.0
 * @Comment: 监听事件类
 */
public class Listener {

    /**
     * 声明打印日志
     */
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 实现kafka的监听方法
     * @param: [record]
     * @return: void
     */
    @KafkaListener(topics = {"test"})
    public void listener(ConsumerRecord<?, ?> record) {
        logger.info("kafka的key: " + record.key());
        logger.info("kafka的value: " + record.value().toString());
    }
}
