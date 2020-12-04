package cn.codenest;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ErrorLogger errorLogger = new ErrorLogger();
        InfoLogger infoLogger = new InfoLogger();
        DebugLogger debugLogger = new DebugLogger();
        errorLogger.setNext(infoLogger);
        infoLogger.setNext(debugLogger);
        infoLogger.logMessage(AbstractLogger.DEBUG,"Hello World!");
    }
}
