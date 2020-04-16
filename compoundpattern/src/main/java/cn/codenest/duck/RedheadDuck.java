package cn.codenest.duck;


import cn.codenest.observ.observable.Observable;
import cn.codenest.observ.observer.Observer;

/**
 * @author Hyman
 * @version 1.0
 * @created 07-4月-2020 19:17:06
 */
public class RedheadDuck implements Quackable {

	Observable observable;
	public RedheadDuck(){
		observable=new Observable(this);
	}

	public void finalize() throws Throwable {

	}
	public void quack(){
		System.out.println("Quack");
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
}//end RedheadDuck