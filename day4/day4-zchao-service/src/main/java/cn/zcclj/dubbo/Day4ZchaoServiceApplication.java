package cn.zcclj.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@DubboComponentScan(basePackages = "cn.zcclj.dubbo.impl")
@EnableDubbo(scanBasePackages = "cn.zcclj.dubbo")
public class Day4ZchaoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day4ZchaoServiceApplication.class, args);
    }

}

