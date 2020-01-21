package cn.java;

import cn.java.displayelement.CurrentConditionDisplay;
import cn.java.weatherdata.WeatherData;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        WeatherData weatherData=new WeatherData();
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        weatherData.serMeasurements(67,23,30.45f);
        weatherData.serMeasurements(85,12,323.1f);
        weatherData.serMeasurements(19,85,100.1f);
        System.out.println( "Hello World!" );
    }
}
