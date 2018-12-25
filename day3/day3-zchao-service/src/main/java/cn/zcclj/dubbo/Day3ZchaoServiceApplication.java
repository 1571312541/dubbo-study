package cn.zcclj.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 二、springboot和dubbo整合第二种方式 ---- 保留xml文件
 *  1、创建xml文件
 *  2、入口引用 @ImportResource(locations = "classpath:dubbo-provider.xml")
 *  3、去掉@Service 、@Reference 注解
 *
 */
@ImportResource(locations = "classpath:dubbo-provider.xml")
@SpringBootApplication
public class Day3ZchaoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day3ZchaoServiceApplication.class, args);
    }

}

