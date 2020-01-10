package cn.school.factory;

import cn.school.model.Person;
import cn.school.model.Student;

/**
 * @author ：Hyman
 * @date ：Created in 2019/12/23 10:27
 * @description：Student工厂
 * @modified By：
 * @version: 1.0$
 */
public class StudentBuilder implements Builder {
    @Override
    public Person build() {
        return new Student();
    }
}
