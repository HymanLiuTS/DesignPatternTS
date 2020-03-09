package cn.codenest;


import java.util.Enumeration;
import java.util.Iterator;


/**
 * @author ：Hyman
 * @date ：Created in 2020/3/9 18:51
 * @description：自定義Enumeration適配器
 * @modified By：
 * @version: 1.0$
 */
public class EnumerationIterator implements Iterator {
    private Enumeration enumeration;
    public EnumerationIterator(Enumeration enumeration){
        this.enumeration=enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
