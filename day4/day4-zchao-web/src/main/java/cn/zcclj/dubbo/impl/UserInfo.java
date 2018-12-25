package cn.zcclj.dubbo.impl;

import cn.zcclj.dubbo.entity.Order;
import cn.zcclj.dubbo.entity.User;
import cn.zcclj.dubbo.service.OrderService;
import cn.zcclj.dubbo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈
 * 需求、查询用户的所有订单信息
 * 假设zchao-web模块和zchao-service模块在不同的服务器，
 * 假设zchao-web模块在A服务器，zchao-service在B服务器，A可以远程调用B的功能
 *
 *  所以订单服务是作为服务提供者 zchao-service
 *   用户服务是服务消费者 zchao-web
 * 〉
 *
 * @author 22902
 * @create 2018/12/19
 */
@Service
public class UserInfo implements UserService {

    @Reference
    private OrderService orderService;

    /**
     * 获取用户信息时，需要知道用户的订单，需要远程调用day4-zchao-service中的服务
     * @param userId 用户id
     * @return user
     */
    @Override
    public User getUserInfo(Integer userId) {
        List<Order> list = orderService.getOrderByUserId(userId);
        for (Order order : list) {
            System.out.println(order);
        }
        User user = new User();
        user.setId(1);
        user.setName("张三");
        user.setAge(20);
        user.setOrders(list);

        return user;
    }
}
