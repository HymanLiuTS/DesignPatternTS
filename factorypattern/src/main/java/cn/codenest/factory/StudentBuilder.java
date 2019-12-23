package cn.codenest.factory;

import cn.codenest.model.Person;
import cn.codenest.model.Student;

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
