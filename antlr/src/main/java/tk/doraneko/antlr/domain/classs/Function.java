package tk.doraneko.antlr.domain.classs;

import tk.doraneko.antlr.domain.expression.Expression;
import tk.doraneko.antlr.domain.expression.FunctionParameter;
import tk.doraneko.antlr.domain.scope.Scope;
import tk.doraneko.antlr.domain.statement.Statement;
import tk.doraneko.antlr.domain.type.Type;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Function extends Expression {

    private final String name;
    private final List<FunctionParameter> arguments;
    private final List<Statement> statements;
    private Scope scope;

    public Function(Scope scope, String name, Type returnType, List<FunctionParameter> arguments, List<Statement> statements) {
        super(returnType);
        this.scope = scope;
        this.name = name;
        this.arguments = arguments;
        this.statements = statements;
    }

    public String getName() {
        return name;
    }

    public List<FunctionParameter> getArguments() {
        return Collections.unmodifiableList(arguments);
    }

    public Collection<Statement> getStatements() {
        return Collections.unmodifiableCollection(statements);
    }

    public Scope getScope() {
        return scope;
    }
}
