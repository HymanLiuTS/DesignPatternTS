package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 07-4月-2020 19:17:13
 */
public class RubberDuck implements Quackable {

	public RubberDuck(){

	}

	public void finalize() throws Throwable {

	}
	public void quack(){
		System.out.println("Squeak");
	}
}//end RubberDuck