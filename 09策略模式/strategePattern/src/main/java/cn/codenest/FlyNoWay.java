package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 12-3月-2020 19:21:41
 */
public class FlyNoWay implements FlyBehavior {

	public FlyNoWay(){

	}

	public void finalize() throws Throwable {

	}
	public void fly(){
		System.out.println("I can't fly.");
	}
}//end FlyNoWay