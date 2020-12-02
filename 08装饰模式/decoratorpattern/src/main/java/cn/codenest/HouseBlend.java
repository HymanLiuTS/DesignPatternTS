package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 22-1月-2020 10:39:59
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public double cost() {
        return 9.8;
    }
}//end HouseBlend