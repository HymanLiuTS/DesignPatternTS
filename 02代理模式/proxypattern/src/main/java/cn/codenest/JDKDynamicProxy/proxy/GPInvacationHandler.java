package cn.codenest.JDKDynamicProxy.proxy;

import java.lang.reflect.Method;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/27 10:11
 * @description：
 * @modified By：
 * @version: $
 */
public interface GPInvacationHandler {
    public Object invoke(Object proxy, Method METHOD, Object[] args) throws Throwable;
}
