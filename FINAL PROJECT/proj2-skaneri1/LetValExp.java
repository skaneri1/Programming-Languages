public class LetValExp extends Expr {
  public final String id;
  public final Expr arg1, arg2;

  public LetValExp(String _id, Expr _arg1, Expr _arg2) {
    id = _id;
    arg1 = _arg1;
    arg2 = _arg2;
  }
  public Value eval(Env e) throws EvalError {
    newEnv = e.addBinding(id, arg1.eval(e));
    return arg2.eval(newEnv);
  }
  public String toString() {
    return "let val " + id + " = " + arg1.toString() + " in " + arg2.toString() + " end";
  }
}
