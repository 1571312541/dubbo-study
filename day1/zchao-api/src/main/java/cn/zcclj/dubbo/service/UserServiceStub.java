package cn.zcclj.dubbo.service;

import cn.zcclj.dubbo.entity.Order;

import java.util.List;

/**
 * 〈本地存根
 * 做 ThreadLocal 缓存，提前验证参数，调用失败后伪造容错数据等等〉
 *
 * @author zc
 * @create 2018/12/19
 */
public class UserServiceStub implements OrderService{

    private final OrderService orderService;

    /**
     * 构造函数传入真正的远程代理对象
     */
    public UserServiceStub(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public List<Order> getOrderByUserId(Integer userId) {
        // 此代码在客户端执行, 你可以在客户端做ThreadLocal本地缓存，或预先验证参数是否合法，等等
        System.out.println("UserServiceStub----------");
        return orderService.getOrderByUserId(userId);
    }
}
