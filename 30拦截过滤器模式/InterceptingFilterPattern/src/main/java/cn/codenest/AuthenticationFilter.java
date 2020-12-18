package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/18 8:43
 * @description：
 * @modified By：
 * @version: $
 */
public class AuthenticationFilter implements Filter {

    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }

}
