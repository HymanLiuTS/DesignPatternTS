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
 * @created 10-1ÔÂ-2020 10:14:44
 */
public abstract class PizzaIngredientFactory {

	public PizzaIngredientFactory(){

	}

	public void finalize() throws Throwable {

	}
	public Cheese createCheese(){
		return null;
	}

	public Clams createClam(){
		return null;
	}

	public Dough createDough(){
		return null;
	}

	public Pepperoni createPepperoni(){
		return null;
	}

	public Sauce createSauce(){
		return null;
	}

	public Veggies[] createVeggies(){
		return null;
	}
}//end PizzaIngredientFactory