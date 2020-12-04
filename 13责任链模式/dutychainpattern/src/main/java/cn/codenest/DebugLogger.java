package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/4 11:24
 * @description：
 * @modified By：
 * @version: $
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger() {
        this.level = 3;
    }

    @Override
    protected void write(String message) {
        System.out.println("DebugLogger :" + message);
    }
}
