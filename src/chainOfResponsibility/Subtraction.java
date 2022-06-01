package chainOfResponsibility;

public class Subtraction implements Operation{
    private Operation nextOperation;

    @Override
    public void setNextOperation(Operation nextOperation) {
        this.nextOperation = nextOperation;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getOperation() == "sub"){
            System.out.println(request.getX()+" - "+request.getY()+" = "+(request.getX() - request.getY()));
        }
        else {
            nextOperation.calculate(request);
        }
    }
}
