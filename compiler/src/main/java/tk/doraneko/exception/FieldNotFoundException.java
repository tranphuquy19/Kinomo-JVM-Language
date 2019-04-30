package tk.doraneko.exception;

import tk.doraneko.domain.scope.Scope;

public class FieldNotFoundException extends RuntimeException {
    public FieldNotFoundException(Scope scope, String fieldName) {
        super("No field found for name " + fieldName + " found in scope" + scope);
    }
}