package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/18 8:47
 * @description：
 * @modified By：
 * @version: $
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
