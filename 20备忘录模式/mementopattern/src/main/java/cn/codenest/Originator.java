package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/11 10:27
 * @description：
 * @modified By：
 * @version: $
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento){
        state = Memento.getState();
    }
}
