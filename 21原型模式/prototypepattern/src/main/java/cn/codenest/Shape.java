package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/13 15:52
 * @description：
 * @modified By：
 * @version: $
 */
public abstract class Shape implements Cloneable  {
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
