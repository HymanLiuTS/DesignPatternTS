package cn.codenest.observ.observable;


import cn.codenest.observ.observer.Observer;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : 你的名字
 * @date : 2020-04-16 18:56
 **/
public interface QuackObservable  {

    public void deleteObserver(Observer observer);
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
