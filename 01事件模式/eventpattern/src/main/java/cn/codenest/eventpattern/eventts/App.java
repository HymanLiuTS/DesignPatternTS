package cn.codenest.eventpattern.eventts;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) throws IOException, TimeoutException {
        Door door = new Door("",0);
        door.setDoorNameListener(new DoorNameListener());
        door.setDoorStateListener(new DoorStateListener());
        door.setName("new Name");
        door.setState(0);
        door.setState(1);
    }

}
