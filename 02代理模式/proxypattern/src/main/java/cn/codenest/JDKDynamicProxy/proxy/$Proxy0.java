package cn.codenest.JDKDynamicProxy.proxy;

import java.lang.reflect.Method;
import java.lang.reflect.UndeclaredThrowableException;

public class $Proxy0 implements cn.codenest.JDKDynamicProxy.domain.Person {
    GPInvacationHandler h;

    public $Proxy0(GPInvacationHandler h) {
        this.h = h;
    }

    @Override
    public void findLove() {
        try {
            Method m = cn.codenest.JDKDynamicProxy.domain.Person.class.getMethod("findLove", new Class[]{});
            this.h.invoke(this, m, new Object[]{});
        } catch (Error _ex) {
        } catch (Throwable e) {
            throw new UndeclaredThrowableException(e);
        }
    }
}
