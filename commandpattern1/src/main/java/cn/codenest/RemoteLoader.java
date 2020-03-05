package cn.codenest;

/**
 * Hello world!
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand=new LightOffCommand(light);
        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);
        GarageDoor door=new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand=new GarageDoorOpenCommand(door);
        GrageDoorCloseCommand grageDoorCloseCommand=new GrageDoorCloseCommand(door);
        remoteControl.setCommand(1,garageDoorOpenCommand,grageDoorCloseCommand);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2 );
}
}
