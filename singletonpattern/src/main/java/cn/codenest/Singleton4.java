package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 * @Description ˫�ؼ����������ȼ��ʵ���Ƿ񴴽������δ�����Ž���ͬ����ֻ�е�һ�λ�ͬ�����ҷ���ʹ��ʱ�Ŵ�����ԭ��
 * @created 14-1��-2020 20:02:31
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