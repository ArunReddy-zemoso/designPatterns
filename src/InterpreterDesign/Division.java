package InterpreterDesign;

public class Division implements Expression{
    private String expression;

    public Division(String expression) {
        this.expression = expression;
    }

    @Override
    public float interpret(Interpreter interpreter) {
        return interpreter.division(expression);
    }
}
