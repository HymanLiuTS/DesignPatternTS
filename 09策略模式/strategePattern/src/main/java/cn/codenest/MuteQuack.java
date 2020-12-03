package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 12-3月-2020 19:21:46
 */
public class MuteQuack implements QuackBehavior {

	public MuteQuack(){

	}

	public void finalize() throws Throwable {

	}
	public void quack(){
		System.out.println("I can't quack.");
	}
}//end MuteQuack