package cn.codenest;

/**
 * Hello world!
 *
 */
public class DuckSimulator
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        DuckSimulator duckSimulator=new DuckSimulator();
        duckSimulator.simulate();
    }

    void simulate(){
        Quackable mallardDuck=new Mallarduck();
        Quackable redheadDuck=new RedheadDuck();
        Quackable duckCall=new DuckCall();
        Quackable rubberDuck=new RubberDuck();

        System.out.println("\nDuck Simulartor");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
