package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/4 11:21
 * @description：
 * @modified By：
 * @version: $
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(){
        this.level=1;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger :" + message);
    }
}
