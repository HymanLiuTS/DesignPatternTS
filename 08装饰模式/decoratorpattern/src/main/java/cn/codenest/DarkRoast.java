package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 22-1月-2020 10:39:51
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public double cost() {
        return 10.5;
    }
}//end DarkRoast