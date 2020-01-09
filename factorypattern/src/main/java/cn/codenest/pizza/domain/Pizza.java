package cn.codenest.pizza.domain;

/**
 * <h3>designpatternts</h3>
 * <p>比萨抽象类</p>
 *
 * @author : hyman
 * @date : 2020-01-09 08:58
 **/
public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    public void prepare() {
        System.out.println("Pareparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings...");
    }

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
}
