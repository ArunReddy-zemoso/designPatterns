package InterpreterDesign;

public class Subtraction implements Expression{
    private String expression;

    public Subtraction(String expression) {
        this.expression = expression;
    }

    @Override
    public float interpret(Interpreter interpreter) {
        return interpreter.subtraction(expression);
    }
}
