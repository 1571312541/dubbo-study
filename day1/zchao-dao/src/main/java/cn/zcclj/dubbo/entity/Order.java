package cn.zcclj.dubbo.entity;

import java.io.Serializable;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/12/19
 */
public class Order implements Serializable {
    /**
     *  订单id
     */
    private Integer id;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 订单号
     */
    private String orderCode;
    /**
     * 订单地址
     */
    private String address;
    /**
     * 订单电话
     */
    private String phone;

    public Order() {
    }

    public Order(Integer id, Integer userId, String orderCode, String address, String phone) {
        this.id = id;
        this.userId = userId;
        this.orderCode = orderCode;
        this.address = address;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", orderCode='" + orderCode + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
