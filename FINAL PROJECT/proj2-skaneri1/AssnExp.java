public class AssnExp extends Expr {
  public final Expr arg1;
  public final String id;
  public AssnExp(Expr _arg1, String _id) {
    arg1 = _arg1;
    id = _id;
  }
  public Value eval(Env e) throws EvalError {
    newEnv = e.addBinding(id, arg1.eval(e));
    return arg1.eval(newEnv);
  }
  public String toString() {
    return id + " := " + arg1.toString();
  }
}
