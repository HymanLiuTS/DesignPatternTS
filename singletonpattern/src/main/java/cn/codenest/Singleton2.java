package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 * @Description 使用synchronized关键字解决了多线程下同步的问题，但是只有在第一次创建对象时
 * 同步才有用，后面每次使用同步变成了累赘
 * @created 14-1月-2020 20:02:31
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