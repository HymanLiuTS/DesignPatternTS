package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/4 11:22
 * @description：
 * @modified By：
 * @version: $
 */
public class InfoLogger extends AbstractLogger {

    public InfoLogger() {
        this.level = 2;
    }

    @Override
    protected void write(String message) {
        System.out.println("InfoLogger :" + message);
    }
}
