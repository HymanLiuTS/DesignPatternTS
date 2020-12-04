package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/4 12:42
 * @description：
 * @modified By：
 * @version: $
 */
public class Black implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
