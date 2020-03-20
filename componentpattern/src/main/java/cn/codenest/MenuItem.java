package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 20-3月-2020 16:15:53
 */
public class MenuItem extends MenuComponent {

	public MenuItem(String name,String description,double price){
		super( name, description, price);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public boolean isVegetraian(){
		return false;
	}

	public int print(){
		System.out.print(" "+getName());
		if(isVegetraian())
			System.out.print("(v)");
		System.out.println(","+getPrice());
		System.out.println("    --"+getDescription());
		return 0;
	}
}//end MenuItem