package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/18 8:44
 * @description：
 * @modified By：
 * @version: $
 */
public class DebugFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("request log: " + request);
    }

}
