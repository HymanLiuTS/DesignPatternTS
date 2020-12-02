package cn.codenest.duck.collection;

import cn.codenest.duck.Quackable;
import cn.codenest.observ.observable.Observable;
import cn.codenest.observ.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ：Hyman
 * @date ：Created in 2020/4/14 19:17
 * @description：
 * @modified By：
 * @version: $
 */
public class Flock implements Quackable {

    ArrayList quackers=new ArrayList();
    public void add(Quackable quacker){
        this.quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator it=quackers.iterator();
        while (it.hasNext()){
            Quackable quacker=(Quackable)it.next();
            quacker.quack();;
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        Iterator it=quackers.iterator();
        while (it.hasNext()){
            Quackable quacker=(Quackable)it.next();
            quacker.deleteObserver(observer);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator it=quackers.iterator();
        while (it.hasNext()){
            Quackable quacker=(Quackable)it.next();
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator it=quackers.iterator();
        while (it.hasNext()){
            Quackable quacker=(Quackable)it.next();
            quacker.notifyObservers();
        }
    }
}
