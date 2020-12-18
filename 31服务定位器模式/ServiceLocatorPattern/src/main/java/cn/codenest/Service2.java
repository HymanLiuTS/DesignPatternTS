package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/19 7:29
 * @description：
 * @modified By：
 * @version: $
 */
public class Service2 implements Service {
    @Override
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}