package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created 23-3月-2020 19:26:16
 */
public class GumballMachine {

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getState() {
		return state;
	}

	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;

	private State state;
	int count=0;

	public GumballMachine(int numberGumballs){
		soldOutState=new SoldOutState(this);
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new HasQuarterSate(this);
		soldState=new SoldState(this);
		if(numberGumballs>0){
			this.state=noQuarterState;
			count=numberGumballs;
		}
	}

	public void finalize() throws Throwable {

	}
	public void insertQuarter(){
		state.insertQuarter();
	}

	public void ejectQuarter(){
		state.ejectQuarter();
	}

	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(State state){
		this.state=state;
	}

	public void releaseBall(){
		System.out.println("A gumball comes rolling out");
		if(count!=0){
			count=count-1;
		}
	}
}//end GumballMachine