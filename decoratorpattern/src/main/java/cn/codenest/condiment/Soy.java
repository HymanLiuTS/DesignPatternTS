package cn.codenest.condiment;


import cn.codenest.Beverage;
import cn.codenest.condiment.CondimentDecorator;

/**
 * @author Hyman
 * @version 1.0
 * @created 22-1月-2020 10:40:05
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage, String description) {
        super(beverage, description);
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public double cost() {
        return 0.75 + this.beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + "+" + this.description;
    }
}//end soy