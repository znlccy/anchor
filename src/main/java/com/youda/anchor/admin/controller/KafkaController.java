package com.youda.anchor.admin.controller;

import com.youda.anchor.admin.response.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Administrator
 * @Datetime: 2018/5/23-11:43
 * @Version: v1.0.0
 * @Comment: kafka控制器
 */
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    /**
     *
     */
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public Response sendKafka(HttpServletRequest request, HttpServletResponse response) {
        try {
            String message = request.getParameter("message");
            logger.info("kafka的消息={}", message);
            kafkaTemplate.send("test", "key", message);
            logger.info("发送kafka成功!");
            return new Response();
        } catch (Exception e) {
            e.printStackTrace();
            return new Response();
        }
    }
}
