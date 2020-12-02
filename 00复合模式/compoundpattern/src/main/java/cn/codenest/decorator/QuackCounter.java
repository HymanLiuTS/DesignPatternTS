package cn.codenest.decorator;

import cn.codenest.duck.Quackable;
import cn.codenest.observ.observer.Observer;

/**
 * @author ：Hyman
 * @date ：Created in 2020/4/14 18:56
 * @description：
 * @modified By：
 * @version: $
 */
public class QuackCounter implements Quackable {

    public QuackCounter(Quackable duck){
        this.duck=duck;
    }

    private Quackable duck;
    static int numberOfQuacks=0;

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public  static int getQuack(){
        return numberOfQuacks;
    }

    @Override
    public void deleteObserver(Observer observer) {
        duck.deleteObserver(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
