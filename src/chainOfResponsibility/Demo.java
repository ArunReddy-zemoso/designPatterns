package chainOfResponsibility;

public class Demo {
    public static void main(String[] args) {
        Operation operationsCal1 = new Addition();
        Operation operationsCal2 = new Subtraction();
        Operation operationsCal3 = new Multiplication();
        Operation operationsCal4 = new Division();

        operationsCal1.setNextOperation(operationsCal2);
        operationsCal2.setNextOperation(operationsCal3);
        operationsCal3.setNextOperation(operationsCal4);

        Numbers request = new Numbers(4,6,"pow");

        operationsCal1.calculate(request);
    }
}
