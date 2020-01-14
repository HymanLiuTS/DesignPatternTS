package cn.codenest.pizza.domain;

import cn.codenest.ingredient.factory.ChicagoPizzaIngredientFactory;

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
        this.pizzaIngredientFactory=new ChicagoPizzaIngredientFactory();
    }

    @Override
    public void prepare() {
        System.out.println("Pareparing ChicagoStyleCheesePizza " + name);
        dough=this.pizzaIngredientFactory.createDough();
        System.out.println("Tossing dough:" + dough.toString());
        sauce=this.pizzaIngredientFactory.createSauce();
        System.out.println("Adding sauce:" + sauce.toString());
        System.out.println("Adding toppings to 10...");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
