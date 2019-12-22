package cn.codenest.model;

/**
 * @author ：Hyman
 * @date ：Created in 2019/12/22 17:43
 * @description：老师测试类
 * @modified By：
 * @version: 1.0$
 */
public class Teacher implements Person{

    @Override
    public void say() {
        System.out.println("hello, I'm a teacher.");
    }
}
