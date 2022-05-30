package InterpreterDesign;

public class Client {
    private Interpreter interpreter;

    public Client(Interpreter interpreter) {
        this.interpreter = interpreter;
    }

    public float interpret(String inputData) {

        Expression expression = null;

        //Check if inputData has add word
        if (inputData.contains("add")) {
            expression = new Addition(inputData);
        }
        //Check if inputData has subtract word
        else if (inputData.contains("subtract")) {
            expression = new Subtraction(inputData);
        }
        else if(inputData.contains("multiply")){
            expression = new Multiplication(inputData);
        }
        else if(inputData.contains("divide")){
            expression = new Division(inputData);
        }
        else {
            throw new RuntimeException(inputData + " is not valid expression!!");
        }

        float result = expression.interpret(interpreter);
        System.out.println(inputData);

        return result;
    }
}
