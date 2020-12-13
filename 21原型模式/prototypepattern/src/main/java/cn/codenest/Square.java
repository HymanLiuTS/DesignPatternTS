package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/13 15:54
 * @description：
 * @modified By：
 * @version: $
 */
public class Square extends Shape  {
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
