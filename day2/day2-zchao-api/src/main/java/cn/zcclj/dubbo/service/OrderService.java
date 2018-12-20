package cn.zcclj.dubbo.service;

import cn.zcclj.dubbo.entity.Order;

import java.util.List;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/12/19
 */
public interface OrderService {
    /**
     * 根据用户id获取所有订单
     * @param userId 用户id
     * @return List<Order>
     */
    List<Order> getOrderByUserId(Integer userId);
}
