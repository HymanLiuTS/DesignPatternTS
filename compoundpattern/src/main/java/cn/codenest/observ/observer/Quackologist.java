package cn.codenest.observ.observer;

import cn.codenest.observ.observable.QuackObservable;

/**
 * @author ：Hyman
 * @date ：Created in 2020/4/16 19:08
 * @description：
 * @modified By：
 * @version: $
 */
public class Quackologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+duck+ " just quacked. ");
    }
}
