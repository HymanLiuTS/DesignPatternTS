package cn.codenest.factory;

import cn.codenest.model.Person;
import cn.codenest.model.Teacher;

/**
 * @author ：Hyman
 * @date ：Created in 2019/12/23 10:30
 * @description：Teacher工厂
 * @modified By：
 * @version: 1.0$
 */
public class TeacherBuilder implements Builder {

    @Override
    public Person build() {
        return new Teacher();
    }
}
