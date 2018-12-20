package cn.zcclj.dubbo.impl;

import cn.zcclj.dubbo.entity.Order;
import cn.zcclj.dubbo.service.OrderService;

import java.util.Arrays;
import java.util.List;

/**
 * 〈 @com.alibaba.dubbo.config.annotation.Service 暴露接口,以便@Reference引用〉
 *
 * @author zc
 * @create 2018/12/19
 */

public class OrderServiceImpl implements OrderService {

    /**
     * 模拟数据库查询，不使用dao层接口
     * @param userId
     * @return List<Order>
     */
    @Override
    public List<Order> getOrderByUserId(Integer userId) {
        Order order1 = new Order(1, 1001, "201812190001", "北京通州马驹桥", "13000000000");
        Order order2 = new Order(2, 1001, "201812190002", "北京丰台七里庄", "13111111111");
        Order order3 = new Order(3, 1001, "201812190003", "北京", "13222222222");
        List<Order> orders = Arrays.asList(order1, order2, order3);
        return orders;
    }
}
