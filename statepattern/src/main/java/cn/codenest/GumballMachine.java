package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 23-3月-2020 19:26:16
 */
public class GumballMachine {

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;

	private State state;
	int count;

	public GumballMachine(int numberGumballs){
		soldOutState=new SoldOutState();
		noQuarterState=new NoQuarterState();
	}

	public void finalize() throws Throwable {

	}
	public void insertQuarter(){

	}

	public void ejectQuarter(){

	}

	public void turnCrank(){

	}

	/**
	 * 
	 * @param state
	 */
	public void setState(State state){

	}

	public void releaseBall(){

	}
}//end GumballMachine