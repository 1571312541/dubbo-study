package cn.zcclj.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *
 */
@ImportResource(locations = "classpath:dubbo-consumer.xml")
@SpringBootApplication
public class Day3ZchaoWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(Day3ZchaoWebApplication.class, args);
    }

}

