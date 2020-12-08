public class VarExp extends Expr {
  public final String str1;
  public VarExp(String _str1) {
    str1 = _str1;
  }
  public Value eval(Env e) throws EvalError {
    return e.lookup(str1);
  }
  public String toString() {
    return str1;
  }
}
