package cn.codenest.pizza.domain;

import cn.codenest.ingredient.entry.Dough;
import cn.codenest.ingredient.entry.Sauce;

/**
 * <h3>designpatternts</h3>
 * <p>芝加哥风味披萨</p>
 *
 * @author : hyman
 * @date : 2020-01-09 09:13
 **/
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = new Dough();
        sauce = new Sauce();
    }

    @Override
    public void prepare() {
        System.out.println("Pareparing NYStyleCheesePizza " + name);
        System.out.println("Tossing dough:" + dough.toString());
        System.out.println("Adding sauce:" + sauce.toString());
        System.out.println("Adding toppings to 10...");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
