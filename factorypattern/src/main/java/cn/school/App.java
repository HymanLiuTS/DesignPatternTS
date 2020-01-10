package cn.school;


import cn.school.factory.*;
import cn.school.model.Person;

public class App {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Person p = simpleFactory.build("student");
        p.say();
        p = simpleFactory.build("teacher");
        p.say();

        MultiFactory multiFactory = new MultiFactory();
        p = multiFactory.buildStuent();
        p.say();
        p = multiFactory.buildTeacher();
        p.say();

        p= StaticFactory.buildStudent();
        p.say();
        p=StaticFactory.buildTeacher();
        p.say();

        Builder b =new StudentBuilder();
        p=b.build();
        p.say();

        b=new TeacherBuilder();
        p=b.build();
        p.say();

    }
}
