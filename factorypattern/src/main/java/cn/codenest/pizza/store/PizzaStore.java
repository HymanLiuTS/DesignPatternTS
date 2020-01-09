package cn.codenest.pizza.store;


import cn.codenest.pizza.domain.Pizza;

/**
 * @author Hyman
 * @version 1.0
 * @created 09-1��-2020 11:09:47
 */
public abstract class PizzaStore {

    public PizzaStore() {

    }

    public void finalize() throws Throwable {

    }

    /**
     * @param type
     */
    protected abstract Pizza createPizza(String type);

    /**
     * @param type
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}//end PizzaStore