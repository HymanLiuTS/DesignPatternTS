package cn.codenest.observer;


/**
 * @author Hyman
 * @version 1.0
 */
public interface Observer {

	/**
	 * 
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	public void update(float temp, float humidity, float pressure);

}