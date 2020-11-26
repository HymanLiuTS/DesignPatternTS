package cn.codenest.eventpattern.eventts;


import java.util.EventListener;

/**
 * @author ：Hyman
 * @date ：Created in 2020/9/22 18:44
 * @description：
 * @modified By：
 * @version: $
 */
public class DoorNameListener implements EventListener {

    public void doorEvent(DoorEvent event) {
        if (event.getValue() != null && event.getValue() != null) {
            System.out.println("门新的名称是：" + event.getValue());
        }
    }
}
