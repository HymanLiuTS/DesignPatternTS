package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 * @Description ��ͨ�ĵ���ģʽ�࣬�ڶ��߳�ʱ���ܳ��ִ���������������
 * @created 14-1��-2020 20:02:31
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