package cn.codenest.weatherdata;

import cn.codenest.observer.Observer;

/**
 * @author Hyman
 * @version 1.0
 */
public interface Subject {

	public void notifyObservers();

	/**
	 * 
	 * @param o
	 */
	public void registerObserver(Observer o);

	/**
	 * 
	 * @param o
	 */
	public void removeObserver(Observer o);

}