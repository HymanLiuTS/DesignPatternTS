package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 16-3月-2020 19:37:36
 */
public class MenuItem {

	private int id;
	private String name;
	public MenuItem(int id, String name){
		this.id = id;
		this.name = name;
	}

	public void finalize() throws Throwable {

	}

	public String toString(){
		return String.format("id:%s,name:%s",this.id,this.name);
	}
}//end MenuItem