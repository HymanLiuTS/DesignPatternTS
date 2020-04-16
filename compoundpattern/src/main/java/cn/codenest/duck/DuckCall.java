package cn.codenest.duck;


import cn.codenest.observ.observable.Observable;
import cn.codenest.observ.observer.Observer;

import java.util.ArrayList;

/**
 * @author Hyman
 * @version 1.0
 * @created 07-4月-2020 19:16:55
 */
public class DuckCall implements Quackable {

	ArrayList observers=new ArrayList();

	Observable observable;
	public DuckCall(){
		observable=new Observable(this);
	}

	public void finalize() throws Throwable {

	}
	public void quack(){
		System.out.println("Kwak");
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observable.deleteObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}
}//end DuckCall