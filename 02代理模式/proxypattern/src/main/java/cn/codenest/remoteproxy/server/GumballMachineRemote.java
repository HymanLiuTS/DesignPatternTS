package cn.codenest.remoteproxy.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : 你的名字
 * @date : 2020-03-26 18:49
 **/
public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation()  throws RemoteException;
    public State getState() throws RemoteException;
}
