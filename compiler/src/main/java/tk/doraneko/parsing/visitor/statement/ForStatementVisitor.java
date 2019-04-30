package tk.doraneko.parsing.visitor.statement;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.antlr.KinomoParser.ForConditionsContext;
import tk.doraneko.antlr.KinomoParser.ForStatementContext;
import tk.doraneko.antlr.KinomoParser.VariableReferenceContext;
import tk.doraneko.domain.node.expression.Expression;
import tk.doraneko.domain.node.statement.Assignment;
import tk.doraneko.domain.node.statement.RangedForStatement;
import tk.doraneko.domain.node.statement.Statement;
import tk.doraneko.domain.node.statement.VariableDeclaration;
import tk.doraneko.domain.scope.LocalVariable;
import tk.doraneko.domain.scope.Scope;
import tk.doraneko.parsing.visitor.expression.ExpressionVisitor;
import org.antlr.v4.runtime.misc.NotNull;

public class ForStatementVisitor extends KinomoBaseVisitor<RangedForStatement> {
    private final Scope scope;
    private final ExpressionVisitor expressionVisitor;

    public ForStatementVisitor(Scope scope) {
        this.scope = scope;
        expressionVisitor = new ExpressionVisitor(this.scope);
    }

    public RangedForStatement visitForStatement(@NotNull ForStatementContext ctx) {
        Scope newScope = new Scope(scope);
        ForConditionsContext forExpressionContext = ctx.forConditions();
        Expression startExpression = forExpressionContext.startExpr.accept(expressionVisitor);
        Expression endExpression = forExpressionContext.endExpr.accept(expressionVisitor);
        VariableReferenceContext iterator = forExpressionContext.iterator;
        StatementVisitor statementVisitor = new StatementVisitor(newScope);
        String varName = iterator.getText();
        if(newScope.isLocalVariableExists(varName)) {
            Statement iteratorVariable = new Assignment(varName, startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression,statement, varName, newScope);
        } else {
            newScope.addLocalVariable(new LocalVariable(varName,startExpression.getType()));
            Statement iteratorVariable = new VariableDeclaration(varName,startExpression);
            Statement statement = ctx.statement().accept(statementVisitor);
            return new RangedForStatement(iteratorVariable, startExpression, endExpression,statement, varName,newScope);
        }
    }

}
