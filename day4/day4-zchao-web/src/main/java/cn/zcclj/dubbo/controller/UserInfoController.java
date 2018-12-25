package cn.zcclj.dubbo.controller;

import cn.zcclj.dubbo.entity.User;
import cn.zcclj.dubbo.impl.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/12/20
 */
@RestController
public class UserInfoController {
    @Resource
    UserInfo userInfo;

    @RequestMapping(value = "/getOrder")
    public User getOrder(){
        return userInfo.getUserInfo(1);
    }

}
