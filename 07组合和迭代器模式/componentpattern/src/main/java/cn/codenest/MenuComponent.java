package cn.codenest;


import java.util.Iterator;

/**
 * @author Hyman
 * @version 1.0
 * @created 20-3月-2020 16:15:51
 */
public abstract class MenuComponent {

	private String name;
	private String description;
	private double price;

	public MenuComponent(String name,String description,double price){
		this.name=name;
		this.description=description;
		this.price=price;
	}

	public String getName(){
		return this.name;
	}

	public String getDescription(){
		return this.description;
	}

	public Double getPrice(){
		return this.price;
	}

	public boolean isVegetraian(){
		return false;
	}

	/**
	 * 
	 * @param component
	 */
	public void addComponent(MenuComponent component){

	}

	/**
	 * 
	 * @param component
	 */
	public int remove(MenuComponent component){
		return 0;
	}

	/**
	 * 
	 * @param index
	 */
	public MenuComponent getChild(int index){
		return null;
	}

	public int print(){

		return 0;
	}

	public Iterator createIterator(){
		return null;
	}
}//end MenuComponent