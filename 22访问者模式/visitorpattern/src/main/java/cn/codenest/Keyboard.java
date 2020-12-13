package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/13 16:44
 * @description：
 * @modified By：
 * @version: $
 */
public class Keyboard  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}