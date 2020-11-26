package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/5 10:23
 * @description：GarageDoor关闭的命令
 * @modified By：
 * @version: 1.0$
 */
public class GrageDoorCloseCommand implements  Command{

    private GarageDoor garageDoor;

    public GrageDoorCloseCommand(GarageDoor garageDoor){
        this.garageDoor=garageDoor;
    }

    @Override
    public void execute() {
        this.garageDoor.close();
    }

    @Override
    public void undo() {
        this.garageDoor.open();
    }
}
