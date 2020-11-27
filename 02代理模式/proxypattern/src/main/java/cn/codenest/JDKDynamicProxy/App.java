package cn.codenest.JDKDynamicProxy;

import cn.codenest.JDKDynamicProxy.domain.Customer;
import cn.codenest.JDKDynamicProxy.domain.Person;
import cn.codenest.JDKDynamicProxy.proxy.GPMeipo;

import java.io.IOException;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/26 19:45
 * @description：
 * @modified By：
 * @version: $
 */
public class App {

    public static void main(String[] args) throws IOException {
        Person obj = (Person) new GPMeipo().getInstance(new Customer());
        System.out.println(obj.getClass());
        obj.findLove();
    }
}
