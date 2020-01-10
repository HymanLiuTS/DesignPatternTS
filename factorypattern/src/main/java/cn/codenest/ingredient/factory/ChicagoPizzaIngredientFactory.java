package cn.codenest.ingredient.factory;

import cn.codenest.ingredient.entry.*;

/**
 * @author Hyman
 * @version 1.0
 * @created 10-1��-2020 10:14:41
 */
public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {

	public ChicagoPizzaIngredientFactory(){

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
}//end ChicagoPizzaIngredientFactory