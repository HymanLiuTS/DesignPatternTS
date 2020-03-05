package cn.codenest;


/**
 * @author Hyman
 * @version 1.0
 * @created
 */
public interface Command {
    public void execute();
    public void undo();
}