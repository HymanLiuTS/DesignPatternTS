package cn.codenest.ingredient.factory;

import cn.codenest.ingredient.entry.*;

/**
 * @author Hyman
 * @version 1.0
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public NYPizzaIngredientFactory() {

    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Clams createClam() {
        return new FreshClams();
    }

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Pepperoni createPepperoni() {
        return new HotPepperoni();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Veggies[] createVeggies() {
        return new FreshVeggies[0];
    }
}//end NYPizzaIngredientFactory