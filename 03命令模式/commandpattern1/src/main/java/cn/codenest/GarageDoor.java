package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 */
public class GarageDoor {

	public GarageDoor(){

	}

	public void finalize() throws Throwable {

	}
	public void close(){
		System.out.println("GarageDoor close!");
	}

	public void open(){
		System.out.println("GarageDoor open!");
	}
}//end GarageDoor