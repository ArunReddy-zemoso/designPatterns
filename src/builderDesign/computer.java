package builderDesign;

public class computer implements ComputerBuild{
    private String processor;
    private String ram;
    private String graphicsCard;
    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void display(){
        System.out.println("Processor - "+this.processor);
        System.out.println("Ram - "+this.ram);
        System.out.println("graphicsCard - "+this.graphicsCard);
    }
}
