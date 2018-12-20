package cn.zcclj.dubbo.service;

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
    void getUserInfo(Integer userId);

}
