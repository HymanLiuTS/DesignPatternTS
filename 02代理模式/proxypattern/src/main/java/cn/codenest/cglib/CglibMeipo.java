package cn.codenest.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/27 13:50
 * @description：
 * @modified By：
 * @version: $
 */
public class CglibMeipo implements MethodInterceptor {

    //要代理的原始对象
    private Object object;

    public Object newProxyInstance(Object target) {
        this.object = target;
        //1-Enhancer类是CGLib中的一个字节码增强器，它可以方便的对你想要处理的类进行扩展
        Enhancer enhancer = new Enhancer();
        //2-将被代理类HuGe设置成父类
        enhancer.setSuperclass(this.object.getClass());
        //3-设置拦截器
        enhancer.setCallback(this);
        //4-动态生成一个代理类
        Object objProxy = enhancer.create();
        return objProxy;
    }




    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before: " + method);
        //调用proxy.invoke()方法，会报java.lang.StackOverflowError错误，原因是invoke()内部会一直被反复调用
        //Object object = proxy.invoke(obj, args);
        Object object = methodProxy.invokeSuper(o, args);
        System.out.println("after: " + method);
        return object;
    }
}
