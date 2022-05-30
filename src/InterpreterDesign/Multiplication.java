package InterpreterDesign;

public class Multiplication implements Expression{
    private String expression;

    public Multiplication(String expression) {
        this.expression = expression;
    }

    @Override
    public float interpret(Interpreter interpreter) {
        return interpreter.multiplication(expression);
    }
}
