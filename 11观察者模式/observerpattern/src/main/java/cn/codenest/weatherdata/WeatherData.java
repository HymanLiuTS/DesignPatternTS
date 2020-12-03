package cn.codenest.weatherdata;

import cn.codenest.observ.Observer;

import java.util.ArrayList;

/**
 * @author Hyman
 * @version 1.0
 */
public class WeatherData implements cn.codenest.weatherdata.Subject {

	public ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){
		observers=new ArrayList();
	}

	public void finalize() throws Throwable {

	}
	public void notifyObservers(){
		for(int i=0;i<observers.size();i++){
			Observer observer=(Observer)observers.get(i);
			observer.update(temperature,humidity,pressure);
		}
	}

	/**
	 * 
	 * @param o
	 */
	public void registerObserver(Observer o){
		observers.add(o);
	}

	/**
	 * 
	 * @param o
	 */
	public void removeObserver(Observer o){
		int i=observers.indexOf(o);
		if(i>0){
			observers.remove(o);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}

	public void serMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
}//end WeatherData