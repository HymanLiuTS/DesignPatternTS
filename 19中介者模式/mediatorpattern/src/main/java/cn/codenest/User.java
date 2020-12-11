package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/11 9:42
 * @description：
 * @modified By：
 * @version: $
 */

public class User {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this,message);
    }
}
