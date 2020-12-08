public class BinExp extends Expr {
  public final Expr arg1, arg2;
  public final BinOp place;
  public BinExp(Expr _arg1, Expr _arg2, BinOp _place) {
    arg1 = _arg1;
    arg2 = _arg2;
    place = _place;
  }
  public Value eval(Env e) throws EvalError {
    Value v1 = arg1.eval(e);
    Value v2 = arg2.eval(e);

    if (place == PLUS ) {
      return v1 + v2;
    }
    if (place == MINUS ) {
      return v1 - v2;
    }
    if (place == TIMES ) {
      return v1 * v2;
    }
    if (place == DIV ) {
      return v1 / v2;
    }
    if (place == EQ ) {
      return v1 = v2;
    }
    if (place == LT ) {
      return v1 < v2;
    }
    if (place == AND ) {
      return v1 && v2;
    }
    if (place == OR ) {
      return v1 || v2;
    }
  }

  public String toString() {
    return arg1.toString() + place + arg2.toString();
  }
}
