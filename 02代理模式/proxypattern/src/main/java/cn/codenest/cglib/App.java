package cn.codenest.cglib;

import cn.codenest.动态代理.po.Order;
import cn.codenest.动态代理.service.OrderService;
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
        HuGe huGe=new HuGe();
        CglibMeipo cglibMeipo=new CglibMeipo();
        HuGe hg =(HuGe)cglibMeipo.newProxyInstance(huGe);
        //4-执行动态代理类的方法
        hg.sing("逍遥叹");
        hg.act("琅琊榜");
    }
}
