package cn.codenest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Hyman
 * @version 1.0
 */
public class Coffee extends CaffeineBeverage {

	 void addCondiments(){
		 System.out.println("Dripping Coffee through filter");
	}

	 void brew(){
		 System.out.println("Adding suger and milk");
	}

	public Boolean customerWantsCondiments(){
	 	String answer=getUserInput();
	 	if(answer.toLowerCase().startsWith("y"))
	 		return true;
	 	else
	 		return false;

	}

	private String getUserInput(){
	 	String answer=null;
	 	System.out.println("Would you like milk and sugar with yopur coffee(y/n)?");
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try {
			answer=in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(answer==null)
			return "no";
		return answer;
	}
}//end Coffee