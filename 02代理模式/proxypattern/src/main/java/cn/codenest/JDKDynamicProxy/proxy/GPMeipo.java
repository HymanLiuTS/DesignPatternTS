package cn.codenest.JDKDynamicProxy.proxy;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/27 12:17
 * @description：
 * @modified By：
 * @version: $
 */
public class GPMeipo implements GPInvacationHandler {

    private Object target;

    public Object getInstance(Object target) throws IOException {
        this.target = target;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(this.target, args);
        after();
        return null;
    }

    private void before() {
        System.out.println("我是媒婆，我要给你找对象");
        System.out.println("开始物色");
    }

    private void after() {
        System.out.println("如果合适的话准备办事");
    }
}
