package cn.codenest.eventpattern.eventts;

import java.util.EventObject;

/**
 * @author ：Hyman
 * @date ：Created in 2020/9/22 18:48
 * @description：
 * @modified By：
 * @version: $
 */
public class DoorEvent extends EventObject {

    private final String key;
    private final Object value;

    public DoorEvent(Object source, String key, Object value) {
        super(source);
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return this.key;
    }

    public Object getValue() {
        return this.value;
    }
}
