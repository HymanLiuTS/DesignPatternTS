package cn.java.displayelement;


import java.util.Observable;
import java.util.Observer;

/**
 * @author Hyman
 * @version 1.0
 */
public class ForecastDisplay implements DisplayElement, Observer {

    public ForecastDisplay() {

    }

    public void finalize() throws Throwable {

    }

    public void display() {

    }

    /**
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure) {

    }

    @Override
    public void update(Observable o, Object arg) {

    }
}//end ForecastDisplay