package cn.codenest.ingredient.entry;


/**
 * @author Hyman
 * @version 1.0
 * @Description �ھ�̬��ʼ�����д�����������֤���̰߳�ȫ�����ǲ���ʹ��ʱ�Ŵ�����
 * @created 14-1��-2020 20:02:31
 */
public class Singleton3 {

    private Singleton3() {
    }

    private static Singleton3 uniqueInstance = new Singleton3();

    public static synchronized Singleton3 getInstance() {
        return uniqueInstance;
    }

}