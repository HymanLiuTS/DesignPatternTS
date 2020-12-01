package cn.codenest.pizza.domain;

import cn.codenest.ingredient.entry.Dough;
import cn.codenest.ingredient.entry.Sauce;
import cn.codenest.ingredient.factory.PizzaIngredientFactory;

/**
 * <h3>designpatternts</h3>
 * <p>比萨抽象类</p>
 *
 * @author : hyman
 * @date : 2020-01-09 08:58
 **/
public abstract class Pizza {
    protected Dough dough;
    protected String name;
    protected PizzaIngredientFactory pizzaIngredientFactory;
    protected Sauce sauce;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minuxtes..");
    }

    public void cut() {
        System.out.println("Cutting the pizza");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStroe box");
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("name:%s,dough:%s,sauce:%s", name, dough, sauce);
    }
}
