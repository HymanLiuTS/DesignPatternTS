package cn.codenest.observ.observable;

import cn.codenest.observ.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;



/**
 * @author ：Hyman
 * @date ：Created in 2020/4/16 18:41
 * @description：
 * @modified By：
 * @version: $
 */
public class Observable implements QuackObservable {

    ArrayList observers=new ArrayList();
    QuackObservable duck;

    public Observable(QuackObservable duck){
        this.duck=duck;
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator it=observers.iterator();
        while (it.hasNext()){
            Observer observer=(Observer)it.next();
            observer.update(duck);
        }
    }
}
