package cn.codenest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class Waitress
{
    ArrayList menus=new ArrayList<Menu>();

    public  Waitress(ArrayList menus){
        this.menus=menus;
    }
    public static void main( String[] args )
    {

        ArrayList menus=new ArrayList<Menu>();
        Menu dinnerMenu=new DinnerMenu();
        Menu packakeHouseMenu=new PackakeHouseMenu();
        menus.add(dinnerMenu);
        menus.add(packakeHouseMenu);
        Waitress waitress=new Waitress(menus);
        waitress.print();
    }

    void print(){
        Iterator it = menus.iterator();
        while (it.hasNext()){
            Menu menu=(Menu)it.next();
            print(menu.createIterator());
        }
    }

    void print(Iterator it){
        while(it.hasNext()){
            MenuItem item=(MenuItem)it.next();
            System.out.println(item.toString());
        }
    }
}
