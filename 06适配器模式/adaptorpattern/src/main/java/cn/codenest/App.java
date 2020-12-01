package cn.codenest;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck duck=new MallardDuck();
        duck.quack();
        duck.fly();
        Turkey turky=new WildTurkey();
        TurkeyAdapter adapter=new TurkeyAdapter(turky);
        adapter.quack();
        adapter.fly();

        ArrayList list=new ArrayList();
        list.add(1);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(12);

        Vector v=new Vector();
        v.add(1);
        v.add(3);
        v.add(5);
        EnumerationIterator it=new EnumerationIterator(v.elements());

        while ((it.hasNext())){
            System.out.println(it.next());
        }
    }
}
