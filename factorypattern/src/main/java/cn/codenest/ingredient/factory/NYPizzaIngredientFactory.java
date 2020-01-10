package cn.codenest.ingredient.factory;

import cn.codenest.ingredient.entry.*;

/**
 * @author Hyman
 * @version 1.0
 * @created 10-1��-2020 10:14:43
 */
public class NYPizzaIngredientFactory extends PizzaIngredientFactory {

	public NYPizzaIngredientFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
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
}//end NYPizzaIngredientFactory