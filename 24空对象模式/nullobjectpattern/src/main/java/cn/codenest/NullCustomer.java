package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/15 8:47
 * @description：
 * @modified By：
 * @version: $
 */
public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}