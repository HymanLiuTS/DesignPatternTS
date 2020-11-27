package cn.codenest.动态代理;

import cn.codenest.动态代理.po.*;
import cn.codenest.动态代理.service.*;
import cn.codenest.动态代理.service.impl.OrderServiceImpl;
import cn.codenest.动态代理.service.proxy.OrderServiceDynamicProxy;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/26 19:45
 * @description：
 * @modified By：
 * @version: $
 */
public class App {

    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(System.currentTimeMillis());
        OrderService orderService = (OrderService)new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
        orderService.createOrder(order);
    }
}
