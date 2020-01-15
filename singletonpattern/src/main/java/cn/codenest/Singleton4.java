package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 * @Description 双重检查加锁，首先检查实例是否创建，如果未创建才进行同步，只有第一次会同步而且符合使用时才创建的原则。
 * @created 14-1月-2020 20:02:31
 */
public class Singleton4 {

    private Singleton4() {
    }

    private static volatile Singleton4 uniqueInstance;

    public static synchronized Singleton4 getInstance() {
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