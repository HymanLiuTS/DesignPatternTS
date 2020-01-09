package cn.codenest.pizza.domain;

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
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
