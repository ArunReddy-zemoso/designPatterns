package chainOfResponsibility;

public class Division implements Operation{
    private Operation nextOperation;

    @Override
    public void setNextOperation(Operation nextOperation) {
        this.nextOperation = nextOperation;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getOperation() == "div"){
            System.out.println(request.getX()+" / "+request.getY()+" = "+((float)request.getX()/(float)request.getY()));
        }
        else {
            System.out.println("this chain only works for addition,subtraction,multiplication and division");
        }
    }
}
