package cn.codenest.静态代理.service;

import cn.codenest.静态代理.po.Order;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : Hyman
 * @date : 2020-11-26 19:18
 **/
public interface OrderService {
    Integer createOrder(Order order);
}
