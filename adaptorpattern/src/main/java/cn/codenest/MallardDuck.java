package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 */
public class MallardDuck implements Duck {

	public MallardDuck(){

	}

	public void finalize() throws Throwable {

	}
	public int fly(){
		System.out.println("I'm flying");
		return 0;
	}

	public int quack(){
		System.out.println("quack");
		return 0;
	}
}//end MallardDuck