package cn.codenest;

import java.util.HashMap;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/9 11:03
 * @description：
 * @modified By：
 * @version: $
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
