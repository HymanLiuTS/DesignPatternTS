package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static Singleton1 uniqueInstance;

    public static Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }

}