package cn.codenest.gumball.server;

import java.io.Serializable;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : 你的名字
 * @date : 2020-03-26 19:21
 **/
public interface State extends Serializable {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
