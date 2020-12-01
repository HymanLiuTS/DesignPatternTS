package cn.codenest.ingredient.factory;

import cn.codenest.ingredient.entry.Cheese;
import cn.codenest.ingredient.entry.Clams;
import cn.codenest.ingredient.entry.Dough;
import cn.codenest.ingredient.entry.Pepperoni;
import cn.codenest.ingredient.entry.Sauce;
import cn.codenest.ingredient.entry.Veggies;

/**
 * @author Hyman
 * @version 1.0
 */
public interface PizzaIngredientFactory {

	public Cheese createCheese();

	public Clams createClam();

	public Dough createDough();

	public Pepperoni createPepperoni();

	public Sauce createSauce();

	public Veggies[] createVeggies();

}