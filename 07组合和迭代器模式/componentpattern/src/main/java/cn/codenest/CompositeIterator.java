package cn.codenest;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/20 18:31
 * @description：
 * @modified By：
 * @version: $
 */
public class CompositeIterator implements Iterator {

    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator it=(Iterator) stack.peek();
            if(!it.hasNext()){
                stack.pop();
                return hasNext();
            }else{
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator it=(Iterator)stack.peek();
            MenuComponent compenont=(MenuComponent)it.next();
            if(compenont instanceof  Menu){
                stack.push(compenont.createIterator());
            }
            return compenont;
        }else{
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
