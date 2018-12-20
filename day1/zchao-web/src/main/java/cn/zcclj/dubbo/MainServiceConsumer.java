package cn.zcclj.dubbo;

import cn.zcclj.dubbo.impl.UserInfo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 〈〉
 *
 * @author zc
 * @create 2018/12/19
 */
public class MainServiceConsumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        UserInfo userInfo = context.getBean(UserInfo.class);
        userInfo.getUserInfo(1);
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
