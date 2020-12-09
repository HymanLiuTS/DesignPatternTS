package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/7 11:13
 * @description：
 * @modified By：
 * @version: $
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
