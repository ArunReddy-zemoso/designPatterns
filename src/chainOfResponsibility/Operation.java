package chainOfResponsibility;

public interface Operation {
    public void setNextOperation(Operation nextOperation);
    public void calculate(Numbers request);
}
