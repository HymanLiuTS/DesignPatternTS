package cn.codenest.静态代理.service.proxy;

import cn.codenest.静态代理.db.DynamicDataSourceEntry;
import cn.codenest.静态代理.po.Order;
import cn.codenest.静态代理.service.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/26 19:32
 * @description：
 * @modified By：
 * @version: $
 */
public class OrderServiceProxy implements OrderService {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private OrderService orderService;

    public OrderServiceProxy(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public Integer createOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.createOrder(order);
        after();
        return 0;
    }

    private void before() {
        System.out.println("Proxy begfore method.");
    }

    private void after() {
        System.out.println("Proxy after method.");
    }
}
