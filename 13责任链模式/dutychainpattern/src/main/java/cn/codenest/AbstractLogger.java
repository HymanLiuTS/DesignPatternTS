package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/4 11:18
 * @description：
 * @modified By：
 * @version: $
 */
public abstract class AbstractLogger {

    public static int ERROR = 1;
    public static int INFO = 2;
    public static int DEBUG = 3;

    protected int level;

    protected AbstractLogger next;

    public void setNext(AbstractLogger next) {
        this.next = next;
    }

    public void logMessage(int level, String message) {
        if (this.level >= level) {
            write(message);
        }
        if (next != null) {
            next.logMessage(level, message);
        }
    }

    abstract protected void write(String message);

}
