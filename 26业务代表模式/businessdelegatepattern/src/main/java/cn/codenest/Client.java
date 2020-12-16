package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/16 9:22
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
