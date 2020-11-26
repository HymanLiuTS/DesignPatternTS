package cn.codenest.dynamicproxy;


/**
 * @author Hyman
 * @version 1.0
 * @created 03-4月-2020 11:23:55
 */
public interface PersonBean {

	public String getName();

	public String getGender();

	public String getInterrests();

	public int getHotOrNotRating();

	/**
	 * 
	 * @param name
	 */
	public void setName(String name);

	/**
	 * 
	 * @param gender
	 */
	public void setGender(String gender);

	/**
	 * 
	 * @param interests
	 */
	public void setInterests(String interests);

	/**
	 * 
	 * @param rating
	 */
	public void setHotOrNotRating(int rating);

}