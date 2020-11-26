package cn.codenest.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author ：Hyman
 * @date ：Created in 2020/4/3 13:52
 * @description：
 * @modified By：
 * @version: $
 */
public class MatchMakingTestDrive {

    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public void drive() {
        PersonBean joe = getPerson("Joe JavaBean");
        PersonBean ownerProxy=getOwnerProxy(joe);
        System.out.println("Name is "+ownerProxy.getName());
        ownerProxy.setInterests("bowling,Go");
        System.out.println("Interests set from owner proxy");
        try{
            ownerProxy.setHotOrNotRating(10);
        }catch (Exception ex){
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is "+ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy=getNonOwnerProxy(joe);
        try {
            nonOwnerProxy.setInterests("bowling,Go");
        } catch (Exception e) {
            System.out.println("Can't set interests from nonowner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(10);
        System.out.println("Rating is "+ownerProxy.getHotOrNotRating());
    }

    public PersonBean getPerson(String name) {
        PersonBean person = new PersonbeanImpl();
        person.setName(name);
        return person;
    }

    public PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    public PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
