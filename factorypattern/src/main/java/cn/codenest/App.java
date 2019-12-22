package cn.codenest;


import cn.codenest.factory.SimpleFactory;
import cn.codenest.model.Person;

public class App {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Person p = simpleFactory.build("student");
        p.say();
        p = simpleFactory.build("teacher");
        p.say();
    }
}
