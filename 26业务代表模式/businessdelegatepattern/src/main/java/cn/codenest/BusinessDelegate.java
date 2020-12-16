package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/16 9:17
 * @description：
 * @modified By：
 * @version: $
 */
public class BusinessDelegate {

    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
