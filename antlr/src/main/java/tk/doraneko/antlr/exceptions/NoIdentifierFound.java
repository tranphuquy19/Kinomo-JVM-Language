package tk.doraneko.antlr.exceptions;

import tk.doraneko.antlr.domain.scope.Scope;

public class NoIdentifierFound extends RuntimeException {
    public NoIdentifierFound(Scope scope, String identifierName) {
        super("No identifier for name " + identifierName + "found in scope" + scope);
    }
}
