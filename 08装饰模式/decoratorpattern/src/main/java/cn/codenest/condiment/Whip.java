package cn.codenest.condiment;


import cn.codenest.Beverage;

/**
 * @author Hyman
 * @version 1.0
 * @created 22-1月-2020 10:40:07
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage, String description) {
        super(beverage, description);
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public double cost() {
        return 0.9 + this.beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + "+" + this.description;
    }
}//end whip