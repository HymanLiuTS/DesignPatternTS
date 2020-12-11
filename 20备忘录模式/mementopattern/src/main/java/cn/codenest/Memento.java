package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/11 10:25
 * @description：备忘录
 * @modified By：
 * @version: $
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
