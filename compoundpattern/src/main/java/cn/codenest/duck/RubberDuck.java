package cn.codenest.duck;


import cn.codenest.observ.observable.Observable;
import cn.codenest.observ.observer.Observer;

/**
 * @author Hyman
 * @version 1.0
 * @created 07-4月-2020 19:17:13
 */
public class RubberDuck implements Quackable {

	Observable observable;
	public RubberDuck(){
		observable=new Observable(this);
	}

	public void finalize() throws Throwable {

	}
	public void quack(){
		System.out.println("Squeak");
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
}//end RubberDuck