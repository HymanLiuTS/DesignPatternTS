package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/16 9:14
 * @description：
 * @modified By：
 * @version: $
 */
public class JMSService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
