package cn.codenest.gumball.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/26 19:31
 * @description：
 * @modified By：
 * @version: $
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        GumballMachineRemote gumballMachineRemote = null;
        int count;
        if (args.length < 2) {
            count = Integer.parseInt(args[1]);
            gumballMachineRemote = new GumballMachine(args[0], count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachineRemote);
        }
    }
}
