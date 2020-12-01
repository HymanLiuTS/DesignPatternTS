package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 */
public class WildTurkey implements Turkey {

	public WildTurkey(){

	}

	public void finalize() throws Throwable {

	}
	public int fly(){
		System.out.println("I'm flying a short distance.");
		return 0;
	}

	public int gobble(){
		System.out.println("gobble,gobble.");
		return 0;
	}
}//end WildTurkey