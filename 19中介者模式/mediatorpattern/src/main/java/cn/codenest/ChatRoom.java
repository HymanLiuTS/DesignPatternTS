package cn.codenest;

import java.util.Date;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/11 9:43
 * @description：
 * @modified By：
 * @version: $
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }

}
