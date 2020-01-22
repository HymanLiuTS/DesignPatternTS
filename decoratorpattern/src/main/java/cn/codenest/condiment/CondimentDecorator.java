package cn.codenest.condiment;


import cn.codenest.Beverage;

/**
 * @author Hyman
 * @version 1.0
 * @created 22-1月-2020 10:39:50
 */
public abstract class CondimentDecorator extends Beverage {

	protected Beverage beverage;

	public CondimentDecorator(Beverage beverage,String description){
		this.beverage=beverage;
		this.description=description;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public String getDescription(){
		return this.description;
	}
}//end CondimentDecorator