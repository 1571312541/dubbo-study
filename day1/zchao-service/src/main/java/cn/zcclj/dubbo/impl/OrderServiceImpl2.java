package cn.zcclj.dubbo.impl;

import cn.zcclj.dubbo.entity.Order;
import cn.zcclj.dubbo.service.OrderService;

import java.util.Arrays;
import java.util.List;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/12/19
 */
public class OrderServiceImpl2 implements OrderService {

    /**
     * 模拟数据库查询，不使用dao层接口
     * @param userId
     * @return List<Order>
     */
    @Override
    public List<Order> getOrderByUserId(Integer userId) {
        System.out.println("getOrderByUserId----------new");
        Order order1 = new Order(1, 1001, "201812190001", "北京通州马驹桥", "13000000000");
        Order order2 = new Order(2, 1001, "201812190002", "北京丰台七里庄", "13111111111");
        Order order3 = new Order(3, 1001, "201812190003", "北京", "13222222222");
        List<Order> orders = Arrays.asList(order1, order2, order3);
      /*  try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return orders;
    }
}
