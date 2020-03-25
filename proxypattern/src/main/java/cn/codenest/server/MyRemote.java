package cn.codenest.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : 你的名字
 * @date : 2020-03-25 09:12
 **/
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
