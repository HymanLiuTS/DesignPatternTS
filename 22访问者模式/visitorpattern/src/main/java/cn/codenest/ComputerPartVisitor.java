package cn.codenest;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : Hyman
 * @date : 2020-12-13 16:50
 **/
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
