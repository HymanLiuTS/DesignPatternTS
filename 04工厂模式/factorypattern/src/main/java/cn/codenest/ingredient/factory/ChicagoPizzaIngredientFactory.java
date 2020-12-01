package cn.codenest.ingredient.factory;

import cn.codenest.ingredient.entry.Cheese;
import cn.codenest.ingredient.entry.Clams;
import cn.codenest.ingredient.entry.Dough;
import cn.codenest.ingredient.entry.Pepperoni;
import cn.codenest.ingredient.entry.Sauce;
import cn.codenest.ingredient.entry.Veggies;
import cn.codenest.ingredient.entry.FrezzingClams;
import cn.codenest.ingredient.entry.ReggianoCheese;
import cn.codenest.ingredient.entry.ThickCrustDough;
import cn.codenest.ingredient.entry.PlumTomatoSauce;
import cn.codenest.ingredient.entry.HotPepperoni;
import cn.codenest.ingredient.entry.FreshVeggies;

/**
 * @author Hyman
 * @version 1.0
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public ChicagoPizzaIngredientFactory() {

    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Clams createClam() {
        return new FrezzingClams();
    }

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Pepperoni createPepperoni() {
        return new HotPepperoni();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Veggies[] createVeggies() {
        return new FreshVeggies[0];
    }
}//end ChicagoPizzaIngredientFactory