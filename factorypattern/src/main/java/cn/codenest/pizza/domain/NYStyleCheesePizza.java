package cn.codenest.pizza.domain;

import cn.codenest.ingredient.factory.ChicagoPizzaIngredientFactory;
import cn.codenest.ingredient.factory.NYPizzaIngredientFactory;

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
        this.pizzaIngredientFactory=new NYPizzaIngredientFactory();
    }


    @Override
    public void prepare() {
        System.out.println("Pareparing NYStyleCheesePizza " + name);
        dough=this.pizzaIngredientFactory.createDough();
        System.out.println("Tossing dough:" + dough.toString());
        sauce=this.pizzaIngredientFactory.createSauce();
        System.out.println("Adding sauce:" + sauce.toString());
        System.out.println("Adding toppings to 10...");
    }
}
