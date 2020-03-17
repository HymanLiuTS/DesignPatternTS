package cn.codenest;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Hyman
 * @version 1.0
 * @created 16-3月-2020 19:33:10
 */
public class PackakeHouseMenu implements Menu{

	private ArrayList menuItems;
	public PackakeHouseMenu(){
		menuItems=new ArrayList();
		for(int i=0;i<10;i++){
			menuItems.add(new MenuItem(i,String.format("i=%d",i)));
		}
	}

	public void finalize() throws Throwable {

	}

	@Override
	public Iterator createIterator() {
		return menuItems.iterator();
	}
}//end packakeHouseMenuIterator