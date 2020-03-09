package cn.codenest;

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
    }
}
