package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/13 15:53
 * @description：
 * @modified By：
 * @version: $
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
