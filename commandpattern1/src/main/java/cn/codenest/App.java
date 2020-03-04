package cn.codenest;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand command = new LightOnCommand(light);
        simpleRemoteControl.setCommand(command);
        simpleRemoteControl.buttonWasPressed();
        System.out.println("Hello World!");
    }
}
