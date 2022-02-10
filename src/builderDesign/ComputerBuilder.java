package builderDesign;

public interface ComputerBuilder {
    public void buildProcessor();
    public void buildRam();
    public void buildGraphicsCard();
    public computer getComputer();
}
