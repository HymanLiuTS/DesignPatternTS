package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 * @Description 普通的单例模式类，在多线程时可能出现创建两个对象的情况
 * @created 14-1月-2020 20:02:31
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