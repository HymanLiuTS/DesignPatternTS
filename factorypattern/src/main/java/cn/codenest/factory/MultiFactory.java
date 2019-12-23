package cn.codenest.factory;

import cn.codenest.model.Person;
import cn.codenest.model.Student;
import cn.codenest.model.Teacher;

/**
 * @author ：Hyman
 * @date ：Created in 2019/12/23 10:10
 * @description：多个工厂方法模式
 * @modified By：
 * @version: 1.0$
 */
public class MultiFactory {
    public Person buildStuent() {
        return new Student();
    }

    public Person buildTeacher() {
        return new Teacher();
    }
}
