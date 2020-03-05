package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created
 */
public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void finalize() throws Throwable {

    }

    @Override
    public void execute() {
        this.light.on();
    }

    @Override
    public void undo() {
        this.light.off();
    }
}//end LightOnCommand