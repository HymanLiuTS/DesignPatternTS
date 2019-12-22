package cn.codenest.factory;

import cn.codenest.model.Person;
import cn.codenest.model.Student;
import cn.codenest.model.Teacher;

/**
 * @author ：Hyman
 * @date ：Created in 2019/12/22 17:38
 * @description：简单工厂模式
 * @modified By：
 * @version: 1.0$
 */
public class SimpleFactory {

    /**
     * name: build
     * create by: Hyman
     * description:简单工厂中创建对象的方法
     * create time: 2019/12/22
     *
     * @parm: a
     * @reurn: a
     */
    public Person build(String type) {
        if ("student".equals(type))
            return new Student();
        if ("teacher".equals(type))
            return new Teacher();
        return null;
    }
}

