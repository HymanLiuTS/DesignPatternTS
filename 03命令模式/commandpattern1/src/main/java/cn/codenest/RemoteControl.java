package cn.codenest;
/**
 * @author Hyman
 * @version 1.0
 * @created
 */
public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControl() {
        onCommands=new Command[7];
        offCommands=new Command[7];
        undoCommand=new NoCommand();
        for(int i=0;i<7;i++){
            onCommands[i]=new NoCommand();
            offCommands[i]=new NoCommand();
        }
    }

    public void onButtonWasPressed(int slot) {
        this.onCommands[slot].execute();
        undoCommand=this.onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        this.offCommands[slot].execute();
        undoCommand=this.offCommands[slot];
    }

    public void undoButtonWasPressed(int slot) {
       undoCommand.undo();
    }

    /**
     * @param
     */
    public void setCommand(int slot,Command onCommand,Command offCommand) {
		this.onCommands[slot]=onCommand;
		this.offCommands[slot]=offCommand;
    }
}