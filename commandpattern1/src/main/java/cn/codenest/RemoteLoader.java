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
        remoteControl.undoButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2 );

        CeilingFan ceilingFan=new CeilingFan();
        CeilingFanHighCommand ceilingFanHighCommand=new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMediumCommand=new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand=new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOffCommand=new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanHighCommand,ceilingFanOffCommand);
        remoteControl.setCommand(1,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControl.setCommand(2,ceilingFanLowCommand,ceilingFanOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.undoButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.undoButtonWasPressed(2);

        Command[] partyOn={lightOnCommand,ceilingFanHighCommand};
        Command[] partyOff={lightOffCommand,ceilingFanOffCommand};
        MacroCommand partyOnMacro=new MacroCommand(partyOn);
        MacroCommand partyOffMacro=new MacroCommand(partyOff);

        remoteControl.setCommand(0,partyOnMacro,partyOffMacro);
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.undoButtonWasPressed(0);
    }
}
