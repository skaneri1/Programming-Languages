public class WhileExp extends Expr {
  public final Expr arg1;
  public final Expr arg2;
  public WhileExp(Expr _arg1, Expr _arg2) {
    arg1 = _arg1;
    arg2 = _arg2;
  }

  public Value eval(Env e) throws EvalError {
    Value v = arg1.eval(e);
    if (v instanceof BoolVal) {
      if(((BoolVal)v).value){
        return arg2.eval(e);
      }
    else {
      throw new EvalError("Evaluation error: Incompatible arg types");
    }

  public String toString() {
    return "while " + arg1.toString() + " do " + arg2.toString();
  }
}
