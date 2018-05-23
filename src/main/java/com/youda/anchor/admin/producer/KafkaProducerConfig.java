package com.youda.anchor.admin.producer;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/22-18:14
 * @Version: v1.0.0
 * @Comment: kafka生产者
 */
@Configuration
@EnableKafka
public class KafkaProducerConfig {

    /**
     * 声明注入生产者服务器地址
     */
    @Value("${kafka.producer.servers}")
    private String servers;

    /**
     * 声明注入生产者重试次数
     */
    @Value("${kafka.producer.retries}")
    private int retries;

    /**
     * 声明注入生产者批量大小
     */
    @Value("${kafka.producer.batch.size}")
    private int batchSize;

    /**
     * 声明注入生产者驻留时间
     */
    @Value("${kafka.producer.linger}")
    private int linger;

    /**
     * 声明注入生产者缓存大小
     */
    @Value("${kafka.producer.buffer.memory}")
    private int bufferMemory;

    /**
     * 实现生产者的配置
     * @param: []
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     */
    public Map<String, Object> producerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, servers);
        props.put(ProducerConfig.RETRIES_CONFIG, retries);
        props.put(ProducerConfig.BATCH_SIZE_CONFIG, batchSize);
        props.put(ProducerConfig.LINGER_MS_CONFIG, linger);
        props.put(ProducerConfig.BUFFER_MEMORY_CONFIG, bufferMemory);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return props;
    }

    /**
     * 实现生产者工厂模式配置
     * @param: []
     * @return: org.springframework.kafka.core.ProducerFactory<java.lang.String,java.lang.String>
     */
    public ProducerFactory<String, String> producerFactory() {
        return new DefaultKafkaProducerFactory<>(producerConfigs());
    }

    /**
     * 实现生产者模板
     * @param: []
     * @return: org.springframework.kafka.core.KafkaTemplate<java.lang.String,java.lang.String>
     */
    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
        return new KafkaTemplate<String, String>(producerFactory());
    }
}
