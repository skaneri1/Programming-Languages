public class BoolConst extends Expr {
    public BoolConst(boolean temp) {
	     boolean bool = temp;
    }
    public Value eval(Env e) throws EvalError {
	     return new BoolVal(bool);
    }
    public String toString() {
	     return String.valueOf(bool);
    }
}
