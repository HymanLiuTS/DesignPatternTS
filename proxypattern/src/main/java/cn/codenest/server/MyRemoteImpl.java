package cn.codenest.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/25 9:17
 * @description：
 * @modified By：
 * @version: $
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    protected MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main( String[] args )  {
        try {
            MyRemote service=new MyRemoteImpl();
            //System.setProperty("java.rmi.server.hostname", "192.168.5.168");
            //LocateRegistry.createRegistry(18088);
            Naming.rebind("//192.168.5.168/RemoteHello",service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
