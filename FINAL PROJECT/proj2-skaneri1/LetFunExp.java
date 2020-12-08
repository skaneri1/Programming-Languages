public class LetFunExp extends Expr {
  public final String str1, str2;
  public final Expr arg1, arg2;
  public LetFunExp(String _str1, String _str2, Expr _arg1, Expr _arg2) {
    str1 = _str1;
    str2 = _str2;
    arg1 = _arg1;
    arg2 = _arg2;
  }
  public Value eval(Env e) throws EvalError {
    newEnv = e.addBinding(str1, new IntVal(10));
    FunVal val = new FunVal(str2, arg1, newEnv);
    newEnv2 = e.updateBinding(str1, val);
    return arg2.eval(newEnv2);
  }

  public String toString() {
    return "let fun " + str1 + "(" + str2 + ") = " + arg1.toString() + " in " + arg2.toString() + " end";
  }
}
