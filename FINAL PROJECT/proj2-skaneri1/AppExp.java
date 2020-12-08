public class AppExp extends Expr {
  public final String id;
  public final Expr arg1;
  public AppExp(String _id, Expr _arg1) {
    id = _id;
    arg1 = _arg1;
  }

  public Value eval(Env e) throws EvalError {
    hold = e.lookup(id);
    newEnv = e.addBinding(hold, arg1.eval(e));
    return arg1.eval(newEnv);
  }

  public String toString() {
    return arg1.toString();
  }
}
