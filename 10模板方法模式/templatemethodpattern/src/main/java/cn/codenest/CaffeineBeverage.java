package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 */
public abstract class CaffeineBeverage {

	abstract void addCondiments();

	private void boilWater(){
		System.out.println("boilWater");
	}

	abstract void brew();

	private void pourInCup(){
		System.out.println("pourInCup");
	}

	public final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()==true){
			addCondiments();
		}
	}

	public Boolean customerWantsCondiments(){
		return true;
	}
}//end CaffeineBeverage