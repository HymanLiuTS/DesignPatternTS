package cn.codenest.eventpattern.eventts;


import java.util.EventListener;

/**
 * @author ：Hyman
 * @date ：Created in 2020/9/22 18:45
 * @description：
 * @modified By：
 * @version: $
 */
public class DoorStateListener implements EventListener {

    public void doorEvent(DoorEvent event) {
        if (event.getValue() != null) {
            Integer state = (Integer) event.getValue();
            if (state.equals(1)) {
                System.out.println("门打开了.");
            } else {
                System.out.println("门打关闭了.");
            }
        }
    }
}
