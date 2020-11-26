package cn.codenest.静态代理;

import cn.codenest.静态代理.po.Order;
import cn.codenest.静态代理.service.OrderService;
import cn.codenest.静态代理.service.impl.OrderServiceImpl;
import cn.codenest.静态代理.service.proxy.OrderServiceProxy;

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
        OrderService orderService = new OrderServiceProxy(new OrderServiceImpl());
        orderService.createOrder(order);
    }
}
