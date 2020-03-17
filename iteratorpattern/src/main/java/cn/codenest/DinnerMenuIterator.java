package cn.codenest;
import java.util.Iterator;


/**
 * @author Hyman
 * @version 1.0
 * @created 16-3月-2020 19:33:06
 */
public class DinnerMenuIterator implements Iterator {

	private MenuItem[] menuItems;
	private  int position=0;

	public DinnerMenuIterator(MenuItem[] menuItems){
		this.menuItems=menuItems;
	}

	public boolean hasNext(){
		return position<this.menuItems.length;
	}

	public Object next(){
		if(this.hasNext()){
			return menuItems[position++];
		}
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}
}//end DinnerMenuIterator