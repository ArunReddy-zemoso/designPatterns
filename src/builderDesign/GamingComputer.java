package builderDesign;

public class GamingComputer implements ComputerBuilder{
    private computer computer;
    public GamingComputer(){
        this.computer=new computer();
    }
    public void buildProcessor(){
        computer.setProcessor("Intel i7");
    }

    public void buildRam(){
        computer.setRam("Crusial 16GB");
    }

    public void buildGraphicsCard(){
        computer.setGraphicsCard("RTX 3080ti");
    }

    public computer getComputer(){
        return  this.computer;
    }
}
