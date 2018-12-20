package cn.zcclj.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  EnableDubbo 开启dubbo注解
 */
@EnableDubbo
@SpringBootApplication
public class Day2ZchaoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day2ZchaoWebApplication.class, args);
    }

}

