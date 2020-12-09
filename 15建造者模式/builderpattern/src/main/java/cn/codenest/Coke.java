package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/7 11:16
 * @description：
 * @modified By：
 * @version: $
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "ColdDrink";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
