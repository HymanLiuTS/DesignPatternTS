package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created
 */
public class SimpleRemoteControl {

    private Command slot;

    public SimpleRemoteControl() {

    }

    public void finalize() throws Throwable {

    }

    public void buttonWasPressed() {
        this.slot.execute();
    }

    /**
     * @param command
     */
    public void setCommand(Command command) {
		this.slot = command;
    }
}//end SimpleRemoteControl