package cn.codenest.gumball.client;

import cn.codenest.gumball.server.GumballMachine;
import cn.codenest.gumball.server.GumballMachineRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/26 19:44
 * @description：
 * @modified By：
 * @version: $
 */
public class GumballMonitorTestDrive {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        String[] location={
                "rmi://santfe.mightgumball.com/gumballmachine",
                "rmi://boulder.mightgumball.com/gumballmachine",
                "rmi://seattle.mightgumball.com/gumballmachine"
        };
        GumballMonitor[] monitor=new GumballMonitor[location.length];
        for(int i=0;i<location.length;i++){
            GumballMachineRemote machine=(GumballMachineRemote)Naming.lookup(location[i]);
            monitor[i]=new GumballMonitor(machine);
            System.out.println(monitor[i]);
        }
        for(int i=0;i<monitor.length;i++){
            monitor[i].report();
        }

    }
}
