package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/16 9:13
 * @description：
 * @modified By：
 * @version: $
 */
public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
