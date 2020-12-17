package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/17 8:32
 * @description：
 * @modified By：
 * @version: $
 */
public class Student {
    private String name;
    private int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
