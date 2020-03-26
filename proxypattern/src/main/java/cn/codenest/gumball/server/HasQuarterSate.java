package cn.codenest.gumball.server;


/**
 * @author Hyman
 * @version 1.0
 * @created 23-3月-2020 19:26:23
 */
public class HasQuarterSate implements State {

	GumballMachine gumballMachine=null;
	public HasQuarterSate(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}

	public void finalize() throws Throwable {

	}
	public void insertQuarter(){
		System.out.println("you can not insert another quarter");
	}

	public void ejectQuarter(){
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank(){
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	public void dispense(){
		System.out.println("No gumball dispensed");
	}
}//end HasQuarterSate