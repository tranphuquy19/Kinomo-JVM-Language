package tk.doraneko.exception;

import tk.doraneko.domain.node.expression.Expression;
import tk.doraneko.domain.node.expression.arthimetic.ArthimeticExpression;

public class UnsupportedArthimeticOperationException extends RuntimeException {
    public UnsupportedArthimeticOperationException(ArthimeticExpression expression) {
        super(prepareMesage(expression));
    }

    private static String prepareMesage(ArthimeticExpression expression) {
        Expression leftExpression = expression.getLeftExpression();
        Expression rightExpression = expression.getRightExpression();
        return "Unsupported arthimetic operation between " + leftExpression +" and "+rightExpression;
    }
}
