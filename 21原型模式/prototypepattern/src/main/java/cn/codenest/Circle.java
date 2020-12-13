package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/13 15:55
 * @description：
 * @modified By：
 * @version: $
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
