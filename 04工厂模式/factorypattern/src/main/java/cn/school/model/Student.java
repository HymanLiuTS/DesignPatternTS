package cn.school.model;

/**
 * @author ：Hyman
 * @date ：Created in 2019/12/22 17:42
 * @description：学生测试类
 * @modified By：
 * @version: 1.0$
 */
public class Student implements Person{

    @Override
    public void say() {
        System.out.println("hello, I'm a student.");
    }
}
