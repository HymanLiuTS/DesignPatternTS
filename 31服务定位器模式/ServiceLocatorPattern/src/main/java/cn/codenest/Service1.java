package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/19 7:28
 * @description：
 * @modified By：
 * @version: $
 */
public class Service1 implements Service {
    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
