public class FunVal extends Value {
    public final String str;
    public final Expr arg1;
    public final Env envp;
    public FunVal(String _str, Expr _arg1, Env _envp) {
	     str = _str;
       arg1 = _arg1;
       envp = _envp;
    }

    public String toString() {
	     return "function";
    }
}
