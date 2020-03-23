package cn.codenest;

import java.util.Iterator;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/20 18:15
 * @description：
 * @modified By：
 * @version: $
 */
public class NullIterator implements  Iterator{


    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {

    }
}
