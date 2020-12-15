package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/15 8:41
 * @description：
 * @modified By：
 * @version: $
 */
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}