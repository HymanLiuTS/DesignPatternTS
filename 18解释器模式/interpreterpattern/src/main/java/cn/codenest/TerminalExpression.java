package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/10 9:58
 * @description：
 * @modified By：
 * @version: $
 */
public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
