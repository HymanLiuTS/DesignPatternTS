package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 22-1月-2020 10:39:56
 */
public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public double cost() {
        return 12.9;
    }
}//end Decaf