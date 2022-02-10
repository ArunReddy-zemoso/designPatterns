package builderDesign;

public class Builder {
    public static void main(String[] args) {
        ComputerBuilder gamingComputer=new GamingComputer();
        SystemsIntegrator systemsIntegrator=new SystemsIntegrator(gamingComputer);
        systemsIntegrator.buildComputer();
        computer computer1=systemsIntegrator.getComputer();
        computer1.display();
        System.out.println();
        ComputerBuilder productionComputer=new ProductionComputer();
        SystemsIntegrator systemsIntegrator1=new SystemsIntegrator(productionComputer);
        systemsIntegrator1.buildComputer();
        computer computer2=systemsIntegrator1.getComputer();
        computer2.display();
    }
}
