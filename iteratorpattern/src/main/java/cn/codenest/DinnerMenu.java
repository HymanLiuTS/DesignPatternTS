package cn.codenest;


import java.util.Iterator;

/**
 * @author Hyman
 * @version 1.0
 * @created 16-3月-2020 19:33:05
 */
public class DinnerMenu implements Menu{

	private MenuItem[] menuItems;
	public DinnerMenu(){
		menuItems=new MenuItem[10];
		for(int i=10;i<20;i++){
			menuItems[i-10]=new MenuItem(i,String.format("i=%d",i));
		}
	}

	public Iterator createIterator(){
		return new DinnerMenuIterator(menuItems);
	}
}//end DinnerMenu