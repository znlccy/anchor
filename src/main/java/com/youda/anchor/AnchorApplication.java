package com.youda.anchor;

import com.github.pagehelper.PageHelper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Properties;

@SpringBootApplication
@RestController
@EnableCaching
@EnableSwagger2
@EnableScheduling
@EnableKafka
public class AnchorApplication {

    /**
     * 初始化界面
     * @param mv
     * @return
     */
    @RequestMapping(value = "/index")
    public ModelAndView index(ModelAndView mv) {
        mv.setViewName("/index");
        mv.addObject("title","欢迎使用Thymeleaf");
        return mv;
    }

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(AnchorApplication.class, args);
    }

    /**
     * 配置Mybatis的分页插件pagehelper
     */
    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("offsetAsPageNum","true");
        properties.setProperty("rowBoundsWithCount","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("dialect","mysql");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
}
