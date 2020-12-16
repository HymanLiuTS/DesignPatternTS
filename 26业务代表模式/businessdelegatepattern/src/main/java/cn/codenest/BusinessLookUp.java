package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/16 9:15
 * @description：
 * @modified By：
 * @version: $
 */
public class BusinessLookUp {

    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }

}
