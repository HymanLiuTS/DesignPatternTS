package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 07-4月-2020 19:16:55
 */
public class DuckCall implements Quackable {

	public DuckCall(){

	}

	public void finalize() throws Throwable {

	}
	public void quack(){
		System.out.println("Kwal");
	}
}//end DuckCall