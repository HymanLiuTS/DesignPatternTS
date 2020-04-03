package cn.codenest.dynamicproxy;


/**
 * @author Hyman
 * @version 1.0
 * @created 03-4月-2020 11:23:58
 */
public class PersonbeanImpl extends Object implements PersonBean {

	private String name;
	private String gender;
	private String interersts;
	private int rating=0;
	private int ratingCount=0;

	public String getName(){
		return name;
	}

	public String getGender(){
		return gender;
	}

	public String getInterrests(){
		return interersts;
	}

	public int getHotOrNotRating(){
		if(ratingCount==0)
			return 0;
		return rating/ratingCount;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name){
		this.name=name;
	}

	/**
	 * 
	 * @param gender
	 */
	public void setGender(String gender){
		this.gender=gender;
	}

	/**
	 * 
	 * @param interests
	 */
	public void setInterests(String interests){
		this.interersts=interests;
	}

	/**
	 * 
	 * @param rating
	 */
	public void setHotOrNotRating(int rating){
		this.rating+=rating;
		this.ratingCount++;
	}
}//end PersonbeanImpl