package cn.codenest.weatherdata;

import cn.codenest.observer.Observer;

/**
 * @author Hyman
 * @version 1.0
 */
public class WeatherData implements cn.codenest.weatherdata.Subject {

	public Observer m_Observer;

	public WeatherData(){

	}

	public void finalize() throws Throwable {

	}
	public void notifyObservers(){

	}

	/**
	 * 
	 * @param o
	 */
	public void registerObserver(Observer o){

	}

	/**
	 * 
	 * @param o
	 */
	public void removeObserver(Observer o){

	}
}//end WeatherData