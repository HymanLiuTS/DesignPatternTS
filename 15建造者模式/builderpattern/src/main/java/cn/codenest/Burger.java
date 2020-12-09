package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/7 11:05
 * @description：
 * @modified By：
 * @version: $
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
