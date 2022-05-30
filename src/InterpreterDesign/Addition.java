package InterpreterDesign;

public class Addition implements Expression{
    private String expression;

    public Addition(String expression) {
        this.expression = expression;
    }

    @Override
    public float interpret(Interpreter interpreter) {
        return interpreter.addition(expression);
    }
}
