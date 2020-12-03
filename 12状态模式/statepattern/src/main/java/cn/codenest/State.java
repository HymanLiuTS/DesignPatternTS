package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 23-3月-2020 19:26:38
 */
public interface State {

	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();

}