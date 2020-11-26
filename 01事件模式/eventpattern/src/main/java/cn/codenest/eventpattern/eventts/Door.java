package cn.codenest.eventpattern.eventts;

import lombok.Data;

/**
 * @author ：Hyman
 * @date ：Created in 2020/9/22 18:41
 * @description：
 * @modified By：
 * @version: $
 */
@Data
public class Door {
    private String name;
    private Integer state;

    private DoorNameListener doorNameListener;
    private DoorStateListener doorStateListener;

    public Door(String name, Integer state) {
        this.name = name;
        this.state = state;
    }

    public void setName(String name) {
        if (this.name.equals(name) == false) {
            this.name = name;
            if (doorNameListener != null) {
                DoorEvent doorEvent = new DoorEvent(this, "name", name);
                doorNameListener.doorEvent(doorEvent);
            }
        }
    }

    public void setState(Integer state) {
        if (this.state.equals(state) == false) {
            this.state = state;
            if (doorStateListener != null) {
                DoorEvent doorEvent = new DoorEvent(this, "state", state);
                doorStateListener.doorEvent(doorEvent);
            }
        }
    }
}
