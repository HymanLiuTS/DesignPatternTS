package cn.codenest.observ.observer;

import cn.codenest.observ.observable.QuackObservable;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : hyman
 * @date : 2020-04-16 19:04
 **/
public interface Observer {
    public void update(QuackObservable duck);
}
