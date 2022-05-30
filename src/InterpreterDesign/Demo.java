package InterpreterDesign;

public class Demo {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        Client client = new Client(interpreter);
        System.out.println("Addition of both numbers is = " + client.interpret("add 300 and 75"));
        System.out.println();
        System.out.println("Subtraction of both numbers is = " + client.interpret("subtract 4 from 100"));
        System.out.println();
        System.out.println("Multiplication of both numbers is = " + client.interpret("multiply 4 and 100"));
        System.out.println();
        System.out.println("Division of both numbers is = " + client.interpret("2 divide by 4"));
    }
}
