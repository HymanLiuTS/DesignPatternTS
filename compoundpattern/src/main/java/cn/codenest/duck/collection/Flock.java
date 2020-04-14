package cn.codenest.duck.collection;

import cn.codenest.duck.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ：Hyman
 * @date ：Created in 2020/4/14 19:17
 * @description：
 * @modified By：
 * @version: $
 */
public class Flock implements Quackable {

    ArrayList quackers=new ArrayList();
    public void add(Quackable quacker){
        this.quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator it=quackers.iterator();
        while (it.hasNext()){
            Quackable quacker=(Quackable)it.next();
            quacker.quack();;
        }
    }
}
