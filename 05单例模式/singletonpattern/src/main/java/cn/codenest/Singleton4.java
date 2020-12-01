package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 */
public class Singleton4 {

    private Singleton4() {
    }

    private static volatile Singleton4 uniqueInstance;

    public static Singleton4 getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton4.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton4();
                }
            }
        }
        return uniqueInstance;
    }

}