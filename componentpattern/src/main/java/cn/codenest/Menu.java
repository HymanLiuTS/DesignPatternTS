package cn.codenest;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Hyman
 * @version 1.0
 * @created 20-3月-2020 16:15:48
 */
public class Menu extends MenuComponent {

	private ArrayList menuComponents=new ArrayList();

	public Menu(String name,String description,double price){
		super( name, description, price);
	}
	/**
	 * 
	 * @param component
	 */
	public void addComponent(MenuComponent component){
		menuComponents.add(component);
	}

	/**
	 * 
	 * @param component
	 */
	public int remove(MenuComponent component){
		menuComponents.remove(component);
		return 0;
	}

	/**
	 * 
	 * @param index
	 */
	public MenuComponent getChild(int index){
		return (MenuComponent)menuComponents.get(index);
	}

	public int print(){
		System.out.print(" "+getName());
		if(isVegetraian())
			System.out.print("(v)");
		System.out.println(","+getPrice());
		System.out.println("    --"+getDescription());

		Iterator it=menuComponents.iterator();
		while(it.hasNext()){
			MenuComponent menuComponent=(MenuComponent)it.next();
			menuComponent.print();
		}
		return 0;
	}
}//end Menu