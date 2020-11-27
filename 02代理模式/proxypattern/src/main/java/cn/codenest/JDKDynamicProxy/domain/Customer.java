package cn.codenest.JDKDynamicProxy.domain;

/**
 * @author ：Hyman
 * @date ：Created in 2020/11/27 10:44
 * @description：
 * @modified By：
 * @version: $
 */
public class Customer implements Person {

    @Override
    public void findLove() {
        System.out.println("高富帅");
    }
}
