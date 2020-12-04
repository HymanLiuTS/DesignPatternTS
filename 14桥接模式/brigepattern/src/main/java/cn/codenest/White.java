package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/4 12:39
 * @description：
 * @modified By：
 * @version: $
 */
public class White implements Color {

    @Override
    public void bepaint(String shape) {
        System.out.println("白色的" + shape);
    }
}
