package cn.codenest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        GumballMachine gumballMachine=new GumballMachine(10);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.ejectQuarter();

        gumballMachine.turnCrank();
    }
}
