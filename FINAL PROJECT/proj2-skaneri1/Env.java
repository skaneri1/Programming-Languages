public interface Env {
    /* Looks up the (first) occurrence of identifier id in the environment.
          If found, it returns the corresponding value, else it throws the exception.*/
    public Value lookup(String id) throws UnboundVar;

    /* Adds the binding of identifier id to value v in the environment and
          returns the (new) environment. */
    public Env addBinding(String id, Value v);

    /* Changes the (first) binding of identifier id in the environment to
          value v and returns the (new) environment. Exception if no binding exists */
    public Env updateBinding(String id, Value v) throws UnboundVar;

    public String toString();
}
