package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 */
public class Singleton2 {

    private Singleton2() {
    }

    private static Singleton2 uniqueInstance;

    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }

}