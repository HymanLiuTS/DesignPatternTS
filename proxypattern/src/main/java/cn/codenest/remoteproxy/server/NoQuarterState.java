package cn.codenest.remoteproxy.server;


/**
 * @author Hyman
 * @version 1.0
 * @created 23-3月-2020 19:26:26
 */
public class NoQuarterState implements State {

	GumballMachine gumballMachine=null;
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}

	public void finalize() throws Throwable {

	}
	public void insertQuarter(){
		System.out.println("you have inserted  quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter(){
		System.out.println("you have not inserted  quarter");
	}

	public void turnCrank(){
		System.out.println("you should insert quarter firstly");
	}

	public void dispense(){
		System.out.println("No gumball dispensed");
	}
}//end NoQuarterState