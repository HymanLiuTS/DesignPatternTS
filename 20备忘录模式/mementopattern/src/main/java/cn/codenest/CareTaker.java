package cn.codenest;
import java.util.ArrayList;
import java.util.List;
/**
 * @author ：Hyman
 * @date ：Created in 2020/12/11 10:30
 * @description：
 * @modified By：
 * @version: $
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
