package cn.codenest.gumball.client;

import cn.codenest.gumball.server.GumballMachineRemote;

import java.rmi.RemoteException;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/26 19:37
 * @description：
 * @modified By：
 * @version: $
 */
public class GumballMonitor {
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + machine.getLocation());
            System.out.println("Current Inventory: " + machine.getCount() + " gumballs");
            System.out.println("Current State: " + machine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
