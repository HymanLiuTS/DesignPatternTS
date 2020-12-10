package cn.codenest;

/**
 * @author ：Hyman
 * @date ：Created in 2020/12/10 10:01
 * @description：
 * @modified By：
 * @version: $
 */
public class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return expr1.interpret(context) && expr2.interpret(context);
    }
}
