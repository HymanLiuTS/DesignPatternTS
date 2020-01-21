package cn.java.displayelement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Hyman
 * @version 1.0
 */
public class ThirdpartDisplay implements DisplayElement, Observer {

    public ThirdpartDisplay() {

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
}//end ThirdpartDisplay