package cn.codenest.动态代理.service.impl;

import cn.codenest.动态代理.dao.*;
import cn.codenest.动态代理.po.*;
import cn.codenest.动态代理.service.*;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/26 19:19
 * @description：
 * @modified By：
 * @version: $
 */
public class OrderServiceImpl implements OrderService {

    OrderDao orderDao;

    public OrderServiceImpl() {
        orderDao = new OrderDao();
    }

    @Override
    public Integer createOrder(Order order) {
        System.out.println("OrderService 调用 orderDao创建订单");
        return orderDao.insert(order);
    }
}
