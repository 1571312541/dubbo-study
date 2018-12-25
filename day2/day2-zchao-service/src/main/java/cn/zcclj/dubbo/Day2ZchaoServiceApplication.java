package cn.zcclj.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  一、springboot整合dubbo第一种方式
 *  1、EnableDubbo 开启dubbo注解
 *  2、application.yaml | application.properties
 *  3、服务提供者 使用dubbo的@Service 注解暴露接口
 *  4、服务消费者 使用@Reference 注解引用
 */
@EnableDubbo
@SpringBootApplication
public class Day2ZchaoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day2ZchaoServiceApplication.class, args);
    }

}

