package cn.codenest.pizza.store;

import cn.codenest.pizza.domain.NYStyleCheesePizza;
import cn.codenest.pizza.domain.Pizza;

/**
 * @author Hyman
 * @version 1.0
 * @created 09-1��-2020 11:09:45
 */
public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore() {

    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    /**
     * @param type
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
            return pizza;
        } else if (type.equals("pepperoni")) {

        } else if (type.equals("veggie")) {

        }
        return null;
    }
}//end NYPizzaStore