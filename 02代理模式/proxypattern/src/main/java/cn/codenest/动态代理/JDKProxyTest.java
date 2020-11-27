package cn.codenest.动态代理;

import cn.codenest.动态代理.po.Order;
import cn.codenest.动态代理.service.OrderService;
import cn.codenest.动态代理.service.impl.OrderServiceImpl;
import cn.codenest.动态代理.service.proxy.OrderServiceDynamicProxy;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/27 9:47
 * @description：
 * @modified By：
 * @version: $
 */
public class JDKProxyTest {

    public static void main(String[] args) throws IOException {
        Order order = new Order();
        order.setCreateTime(System.currentTimeMillis());
        OrderService orderService = (OrderService) new OrderServiceDynamicProxy().getInstance(new OrderServiceImpl());
        orderService.createOrder(order);

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{OrderService.class});
        FileOutputStream os=new FileOutputStream("E://$Proxy0.class");
        os.write(bytes);
        os.close();
    }
}
