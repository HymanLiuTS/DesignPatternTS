package cn.school.factory;

import cn.school.model.Person;
import cn.school.model.Student;
import cn.school.model.Teacher;

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
