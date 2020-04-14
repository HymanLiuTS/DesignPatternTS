package cn.codenest;

import cn.codenest.decorator.QuackCounter;
import cn.codenest.duck.*;
import cn.codenest.duck.collection.Flock;
import cn.codenest.factory.AbstractDuckFactory;
import cn.codenest.factory.DuckFactory;
import cn.codenest.goose.Goose;
import cn.codenest.goose.GooseAdapter;

/**
 * Hello world!
 *
 */
public class DuckSimulator
{
    public static void main( String[] args )
    {
        DuckSimulator duckSimulator=new DuckSimulator();
        duckSimulator.simulate();
    }

    void simulate(){
        AbstractDuckFactory duckFactory=new DuckFactory();
        Quackable mallardDuck=duckFactory.createMallarduck();
        Quackable redheadDuck=duckFactory.createRedheadDuck();
        Quackable duckCall=duckFactory.createDuckCall();
        Quackable rubberDuck=duckFactory.createRubberDuck();
        Quackable gooseDuck=new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulartor: With Composite - Flocks");

        Flock flockOfDucks=new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards=new Flock();
        Quackable mallard1=duckFactory.createMallarduck();
        Quackable mallard2=duckFactory.createMallarduck();
        Quackable mallard3=duckFactory.createMallarduck();
        Quackable mallard4=duckFactory.createMallarduck();

        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);

        flockOfDucks.add(flockOfMallards);
        System.out.println("\nDuck Simulartor: With Whole Flock Simulation");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulartor: With Mallard Flock Simulation");
        simulate(flockOfMallards);
        System.out.println("The ducks quacked "+QuackCounter.getQuack()+ " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
