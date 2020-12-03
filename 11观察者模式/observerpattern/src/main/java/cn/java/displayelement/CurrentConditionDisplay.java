package cn.java.displayelement;


import cn.java.weatherdata.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Hyman
 * @version 1.0
 */
public class CurrentConditionDisplay implements DisplayElement, Observer {

    private float temperature;
    private float humidity;
    public Observable weatherData;

    public CurrentConditionDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    public void finalize() throws Throwable {

    }

    public void display() {
        System.out.println("Current condition: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}//end CurrentConditionDisplay