package cn.codenest.pizza.domain;

import cn.codenest.ingredient.entry.Dough;
import cn.codenest.ingredient.entry.Sauce;

/**
 * <h3>designpatternts</h3>
 * <p>纽约风味披萨</p>
 *
 * @author : hyman
 * @date : 2020-01-09 09:10
 **/
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style sauce and cheese Pizza";
        dough = new Dough();
        sauce = new Sauce();
    }


    @Override
    public void prepare() {
        System.out.println("Pareparing NYStyleCheesePizza " + name);
        System.out.println("Tossing dough:" + dough.toString());
        System.out.println("Adding sauce:" + sauce.toString());
        System.out.println("Adding toppings to 5...");
    }
}
