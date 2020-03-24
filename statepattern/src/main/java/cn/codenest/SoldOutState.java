package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 23-3月-2020 19:26:30
 */
public class SoldOutState implements State {

	GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}

	public void finalize() throws Throwable {

	}
	public void insertQuarter(){
		System.out.println("there are No gumball ");
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
}//end SoldOutState