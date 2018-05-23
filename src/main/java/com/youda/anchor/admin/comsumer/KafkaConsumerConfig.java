package com.youda.anchor.admin.comsumer;

import com.youda.anchor.admin.listener.Listener;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/23-10:55
 * @Version: v1.0.0
 * @Comment: kafka消费者
 */
@Configuration
@EnableKafka
public class KafkaConsumerConfig {

    /**
     * 声明注入消费者的服务器地址
     */
    @Value("${kafka.consumer.servers}")
    private String servers;

    /**
     * 声明注入消费者的自动提交
     */
    @Value("${kafka.consumer.enable.auto.commit}")
    private boolean enableAutoCommit;

    /**
     * 声明注入消费者回话的过期时间
     */
    @Value("${kafka.consumer.session.timeout}")
    private String sessionTimeout;

    /**
     * 声明注入消费者自动提交时间
     */
    @Value("${kafka.consumer.auto.commit.interval}")
    private String autoCommitInterval;

    /**
     * 声明注入消费者分组ID
     */
    @Value("${kafka.consumer.group.id}")
    private String groupId;

    /**
     * 声明注入消费者偏移设置
     */
    @Value("${kafka.consumer.auto.offset.reset}")
    private String autoOffsetReset;

    /**
     * 声明注入消费者当前货币
     */
    @Value("${kafka.consumer.concurrency}")
    private int concurrency;

    /**
     * 实现消费者配置工厂模式
     * @param: []
     * @return: org.springframework.kafka.config.KafkaListenerContainerFactory<org.springframework.kafka.listener.ConcurrentMessageListenerContainer<java.lang.String,java.lang.String>>
     */
    @Bean
    public KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<String, String>> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        factory.setConcurrency(concurrency);
        factory.getContainerProperties().setPollTimeout(1500);
        return factory;
    }

    /**
     * 实现消费者工厂
     * @param: []
     * @return: org.springframework.kafka.core.ConsumerFactory<java.lang.String,java.lang.String>
     */
    public ConsumerFactory<String, String> consumerFactory() {
        return new DefaultKafkaConsumerFactory<>(consumerConfigs());
    }

    /**
     * 实现消费者配置
     * @param: []
     * @return: java.util.Map<java.lang.String,java.lang.Object>
     */
    public Map<String, Object> consumerConfigs() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, servers);
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, enableAutoCommit);
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, autoCommitInterval);
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, sessionTimeout);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, autoOffsetReset);
        return props;
    }

    /**
     * 实现消费者监听
     * @param: []
     * @return: com.youda.anchor.admin.listener.Listener
     */
    @Bean
    public Listener listener() {
        return new Listener();
    }
}
