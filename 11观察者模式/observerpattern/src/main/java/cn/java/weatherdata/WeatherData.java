package cn.java.weatherdata;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * @author Hyman
 * @version 1.0
 */
public class WeatherData extends Observable {

    public ArrayList observers;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    private float temperature;

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    private float humidity;

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    private float pressure;

    public void finalize() throws Throwable {

    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers(this);
    }

    public void serMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}//end WeatherData