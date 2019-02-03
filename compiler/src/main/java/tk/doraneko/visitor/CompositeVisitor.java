package tk.doraneko.visitor;

import tk.doraneko.antlr.KinomoBaseVisitor;
import tk.doraneko.exception.NoVisitorReturnedValueException;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.Arrays;

public class CompositeVisitor<T> {

    private KinomoBaseVisitor<? extends T>[] visitors;

    public CompositeVisitor(KinomoBaseVisitor<? extends T> ... visitors) {
        this.visitors = visitors;
    }

    public T accept(ParserRuleContext context) {
        return Arrays.stream(visitors)
                .map(context::accept)
                .filter(t -> t!=null)
                .findFirst()
                .orElseThrow(() -> new NoVisitorReturnedValueException());
    }
}
