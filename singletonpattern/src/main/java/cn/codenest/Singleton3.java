package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 * @Description 在静态初始化器中创建但见，保证了线程安全，但是不是使用时才创建。
 * @created 14-1月-2020 20:02:31
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 uniqueInstance = new Singleton3();

    public static synchronized Singleton3 getInstance() {
        return uniqueInstance;
    }

}