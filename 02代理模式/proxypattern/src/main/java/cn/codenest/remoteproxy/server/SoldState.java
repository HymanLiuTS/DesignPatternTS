package cn.codenest.remoteproxy.server;


/**
 * @author Hyman
 * @version 1.0
 * @created 23-3月-2020 19:26:34
 */
public class SoldState implements State {

	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}

	public void finalize() throws Throwable {

	}
	public void insertQuarter(){
		System.out.println("please wait,we are already giving you a gumball");
	}

	public void ejectQuarter(){
		System.out.println("Sorry,you already turned the crank");
	}

	public void turnCrank(){
		System.out.println("Turning twice can not give you another gumball");
	}

	public void dispense(){
		System.out.println("Give you a gumball");
		if(gumballMachine.count>0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}//end SoldState