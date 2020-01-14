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
 * @created 14-1ÔÂ-2020 20:11:41
 */
public interface PizzaIngredientFactory {

	public Cheese createCheese();

	public Clams createClam();

	public Dough createDough();

	public Pepperoni createPepperoni();

	public Sauce createSauce();

	public Veggies[] createVeggies();

}