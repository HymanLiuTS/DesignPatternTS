package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/18 8:47
 * @description：
 * @modified By：
 * @version: $
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
