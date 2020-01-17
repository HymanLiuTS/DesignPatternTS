package cn.codenest.displayelement;

import cn.codenest.observer.Observer;
import cn.codenest.weatherdata.Subject;

/**
 * @author Hyman
 * @version 1.0
 */
public class CurrentConditionDisplay implements cn.codenest.displayelement.DisplayElement, Observer {

	public Subject m_Subject;

	public CurrentConditionDisplay(){

	}

	public void finalize() throws Throwable {

	}
	public void display(){

	}

	/**
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temp, float humidity, float pressure){

	}
}//end CurrentConditionDisplay