package builderDesign;

public class SystemsIntegrator {
    private ComputerBuilder computerBuilder;
    public SystemsIntegrator(ComputerBuilder computerBuilder){
        this.computerBuilder=computerBuilder;
    }

    public computer getComputer(){
        return this.computerBuilder.getComputer();
    }

    public void buildComputer(){
        this.computerBuilder.buildProcessor();
        this.computerBuilder.buildRam();
        this.computerBuilder.buildGraphicsCard();
    }
}
