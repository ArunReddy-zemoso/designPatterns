package InterpreterDesign;

public class Interpreter {

    public int addition(String inputData) {
        String[] tokens = interpret(inputData);
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[1]);
        return x + y;
    }
    //Perform Subtraction
    public int subtraction(String inputData) {
        String[] tokens = interpret(inputData);
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[1]);
        return x - y;
    }

    public int multiplication(String inputData) {
        String[] tokens = interpret(inputData);
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[1]);
        return x * y;
    }

    public float division(String inputData) {
        String[] tokens = interpret(inputData);
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[1]);
        return (float) x / (float)y;
    }

    private String[] interpret(String inputData) {
        //System.out.println(inputData + "     1");
        String tempInputData = inputData.replaceAll("[^0-9]", " ");
        //System.out.println(tempInputData + "     2");
        tempInputData = tempInputData.replaceAll("( )+", " ").trim();
        //System.out.println(tempInputData + "    3");
        String[] inputDatatokens = tempInputData.split(" ");
        return inputDatatokens;
    }

}
