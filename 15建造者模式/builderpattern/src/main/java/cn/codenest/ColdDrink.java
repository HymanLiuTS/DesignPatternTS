package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/7 11:07
 * @description：
 * @modified By：
 * @version: $
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
