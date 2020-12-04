package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/4 13:36
 * @description：
 * @modified By：
 * @version: $
 */
public abstract class Shape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
