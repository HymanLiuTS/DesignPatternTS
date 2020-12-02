package cn.codenest;

import cn.codenest.decorator.QuackCounter;
import cn.codenest.duck.*;
import cn.codenest.duck.collection.Flock;
import cn.codenest.factory.AbstractDuckFactory;
import cn.codenest.factory.DuckFactory;
import cn.codenest.goose.Goose;
import cn.codenest.goose.GooseAdapter;
import cn.codenest.observ.observer.Quackologist;

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
        Quackologist quackologist=new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        System.out.println("\nDuck Simulartor: With Observer");
        simulate(flockOfDucks);
        
        System.out.println("The ducks quacked "+QuackCounter.getQuack()+ " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
