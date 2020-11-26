package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 06-3��-2020 9:13:55
 */
public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	private int speed;
	private int location;

	public CeilingFan(){

	}

	public int getSpeed(){
		return this.speed;
	}

	public void high(){
		speed=HIGH;
		System.out.println("speed=hight");
	}

	public void low(){
		speed=LOW;
		System.out.println("speed=low");
	}

	public void medium(){
		speed=MEDIUM;
		System.out.println("speed=medium");
	}

	public void off(){
		speed=OFF;
		System.out.println("speed=off");
	}
}//end CeilingFan