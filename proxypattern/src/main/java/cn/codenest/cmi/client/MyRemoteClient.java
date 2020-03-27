package cn.codenest.cmi.client;



import cn.codenest.cmi.server.MyRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/25 10:01
 * @description：
 * @modified By：
 * @version: $
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("//192.168.5.118/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
