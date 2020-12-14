package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/14 8:59
 * @description：
 * @modified By：
 * @version: $
 */
public class Person {
    private String name;
    private String gender;
    private String maritalStatus;

    public Person(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }
}
