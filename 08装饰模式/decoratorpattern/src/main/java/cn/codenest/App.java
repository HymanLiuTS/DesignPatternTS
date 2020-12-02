package cn.codenest;

import cn.codenest.condiment.Milk;
import cn.codenest.condiment.Soy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Beverage decaf = new Decaf();
        System.out.println(decaf.getDescription() + ":" + decaf.cost());
        Milk milk = new Milk(decaf, "milk");
        System.out.println(milk.getDescription() + ":" + milk.cost());
        Soy soy = new Soy(milk, "soy");
        System.out.println(soy.getDescription() + ":" + soy.cost());
    }
}
