package cn.codenest;


import java.util.Iterator;

/**
 * @author Hyman
 * @version 1.0
 * @created 20-3月-2020 16:15:57
 */
public class Waittress {

	public MenuComponent allMenuComponent;

	public Waittress( MenuComponent allMenuComponent){
		this.allMenuComponent=allMenuComponent;
	}

	public void printMenu() throws Throwable {
		allMenuComponent.print();
	}

	public void printMenuPlus(){
		Iterator it=allMenuComponent.createIterator();
		System.out.println("find it");
		while(it.hasNext()){
			MenuComponent menuComponent=(MenuComponent)it.next();
			menuComponent.print();
		}
	}
}//end Waittress