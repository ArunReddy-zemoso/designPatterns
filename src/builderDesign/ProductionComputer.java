package builderDesign;

public class ProductionComputer implements ComputerBuilder{
    private computer computer;
    public ProductionComputer(){
        this.computer=new computer();
    }
    public void buildProcessor(){
        computer.setProcessor("Intel i5");
    }

    public void buildRam(){
        computer.setRam("Crusial 8GB");
    }

    public void buildGraphicsCard(){
        computer.setGraphicsCard("RTX 1650 super");
    }

    public computer getComputer(){
        return  this.computer;
    }
}
