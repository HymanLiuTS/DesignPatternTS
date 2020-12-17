package cn.codenest;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
