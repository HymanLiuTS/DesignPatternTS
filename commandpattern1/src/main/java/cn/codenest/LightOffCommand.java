package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/5 10:17
 * @description：灯关闭命令
 * @modified By：
 * @version: 1.0$
 */
public class LightOffCommand implements  Command{

    Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
