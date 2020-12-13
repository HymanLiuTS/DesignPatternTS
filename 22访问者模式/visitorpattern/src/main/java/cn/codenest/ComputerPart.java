package cn.codenest;

/**
 * <h3>designpatternts</h3>
 * <p></p>
 *
 * @author : Hyman
 * @date : 2020-12-13 16:37
 **/
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
