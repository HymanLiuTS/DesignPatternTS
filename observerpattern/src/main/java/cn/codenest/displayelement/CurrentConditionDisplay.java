package cn.codenest.displayelement;

import cn.codenest.observ.Observer;
import cn.codenest.weatherdata.Subject;

/**
 * @author Hyman
 * @version 1.0
 */
public class CurrentConditionDisplay implements cn.codenest.displayelement.DisplayElement, Observer {

	private float temperature;
	private float humidity;
	public Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}

	public void finalize() throws Throwable {

	}
	public void display(){
		System.out.println("Current condition: "+temperature+"F degrees and "+humidity+"% humidity");
	}

	/**
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temp, float humidity, float pressure){
		this.temperature=temp;
		this.humidity=humidity;
		display();
	}
}//end CurrentConditionDisplay