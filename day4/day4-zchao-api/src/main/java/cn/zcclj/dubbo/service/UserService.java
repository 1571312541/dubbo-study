package cn.zcclj.dubbo.service;

import cn.zcclj.dubbo.entity.User;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/12/19
 */
public interface UserService {

    /**
     * 获取用户信息，包括用户的所有订单
     * @param userId
     */
    User getUserInfo(Integer userId);

}
