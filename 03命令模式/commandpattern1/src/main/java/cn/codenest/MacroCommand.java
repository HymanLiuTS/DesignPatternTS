package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/3/6 10:13
 * @description：多种命令组合的宏命令
 * @modified By：
 * @version: 1.0$
 */
public class MacroCommand implements  Command{

    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands=commands;
    }

    @Override
    public void execute() {
        for(int i=0;i<commands.length;i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for(int i=commands.length-1;i>=0;i--){
            commands[i].undo();
        }
    }
}
