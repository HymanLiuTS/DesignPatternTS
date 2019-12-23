package cn.codenest.factory;

import cn.codenest.model.Person;
import cn.codenest.model.Student;
import cn.codenest.model.Teacher;

/**
 * @author ：Hyman
 * @date ：Created in 2019/12/23 10:17
 * @description：静态工厂方法
 * @modified By：
 * @version: 1.0$
 */
public class StaticFactory {
    public static Person buildStudent() {
        return new Student();
    }

    public static Person buildTeacher() {
        return new Teacher();
    }
}
