package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 */
public class TurkeyAdapter implements Duck {

	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey){
		this.turkey=turkey;
	}

	public void finalize() throws Throwable {

	}
	public int fly(){
		for(int i=0;i<5;i++){
			turkey.fly();
		}
		return 0;
	}

	public int quack(){
		turkey.gobble();
		return 0;
	}
}//end TurkeyAdapter