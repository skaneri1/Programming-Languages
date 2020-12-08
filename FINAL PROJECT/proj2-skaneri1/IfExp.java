public class IfExp extends Expr {
  public final Expr arg1, arg2, arg3;
  public IfExp(Expr _arg, Expr _arg1, Expr _arg2) {
    arg1 = _arg;
    arg2 = _arg1;
    arg3 = _arg2;
  }
  public Value eval(Env e) throws EvalError {
    Value v = arg1.eval(e);
    if (v instanceof BoolVal) {
      if(((BoolVal)v).value){
        return arg2.eval(e);
      }
      else{
        return arg3.eval(e)
      }
    }
    else throw new EvalError("Evaluation error: Incompatible arg types");
  }

  public String toString() {
    return "if " + arg1.toString() + " then " + arg2.toString() + " else " + arg3.toString();
  }
}
