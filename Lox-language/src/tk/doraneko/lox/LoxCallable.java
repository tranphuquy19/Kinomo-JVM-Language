//> Functions callable
package tk.doraneko.lox;

import java.util.List;

interface LoxCallable {
//> callable-arity
  int arity();
//< callable-arity
  Object call(Interpreter interpreter, List<Object> arguments);
}
