package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 22-1月-2020 10:39:47
 */
public abstract class Beverage {

    protected String description;

    public Beverage() {

    }

    public void finalize() throws Throwable {

    }

    public abstract double cost();

    public String getDescription() {
        return this.description;
    }
}//end Beverage