package cn.codenest.静态代理.dao;

import cn.codenest.静态代理.po.Order;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/26 19:11
 * @description：
 * @modified By：
 * @version: $
 */
public class OrderDao {

    public Integer insert(Order order) {
        System.out.println("OrderDao 创建订单成功。");
        return 1;
    }
}
