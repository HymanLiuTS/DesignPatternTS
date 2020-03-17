package cn.codenest;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Menu dinnerMenu=new DinnerMenu();
        Iterator it=dinnerMenu.createIterator();
        while(it.hasNext()){
            MenuItem item=(MenuItem)it.next();
            System.out.println(item.toString());
        }

        Menu packakeHouseMenu=new PackakeHouseMenu();
        it=packakeHouseMenu.createIterator();
        while(it.hasNext()){
            MenuItem item=(MenuItem)it.next();
            System.out.println(item.toString());
        }
    }
}
