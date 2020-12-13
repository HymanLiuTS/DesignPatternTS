package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/13 16:39
 * @description：
 * @modified By：
 * @version: $
 */
public class Mouse  implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}