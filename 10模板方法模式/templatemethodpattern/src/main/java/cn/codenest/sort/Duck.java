package cn.codenest.sort;


/**
 * @author Hyman
 * @version 1.0
 * @created 11-3月-2020 10:26:02
 */
public class Duck implements Comparable {

	private String name;
	private int weight;

	public Duck(String name,int weight){
		this.name=name;
		this.weight=weight;
	}

	public void finalize() throws Throwable {

	}

	public String toString(){
		return this.name+" weighs "+weight;
	}

	/**
	 * 
	 * @param object
	 */
	public int compareTo(Object object){
		Duck other=(Duck)object;
		if(this.weight<other.weight)
			return -1;
		else if(this.weight>other.weight)
			return 1;
		return 0;
	}

}//end Duck