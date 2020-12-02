package cn.codenest.goose;

import cn.codenest.duck.Quackable;
import cn.codenest.observ.observable.Observable;
import cn.codenest.observ.observer.Observer;

/**
 * @author ：Hyman
 * @date ：Created in 2020/4/14 18:50
 * @description：
 * @modified By：
 * @version: $
 */
public class GooseAdapter implements Quackable {

    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose){
        this.goose=goose;
        observable=new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        notifyObservers();
    }

    @Override
    public void deleteObserver(Observer observer) {
        observable.deleteObserver(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
