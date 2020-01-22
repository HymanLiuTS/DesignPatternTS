package cn.codenest.condiment;


import cn.codenest.Beverage;
import cn.codenest.condiment.CondimentDecorator;

/**
 * @author Hyman
 * @version 1.0
 * @created 22-1月-2020 10:40:03
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage, String description) {
        super(beverage, description);
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public double cost() {
        return 1.55 + this.beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + "+" + this.description;
    }
}//end Milk