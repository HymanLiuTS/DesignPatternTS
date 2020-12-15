package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/15 8:48
 * @description：
 * @modified By：
 * @version: $
 */
public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}