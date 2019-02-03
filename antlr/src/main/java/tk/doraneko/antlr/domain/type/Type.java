package tk.doraneko.antlr.domain.type;

public interface Type {
    String getName();
    Class<?> getTypeClass();
    String getDescriptor();
    String getInternalName();
}
