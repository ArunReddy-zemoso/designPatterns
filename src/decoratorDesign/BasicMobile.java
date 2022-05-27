package decoratorDesign;

public class BasicMobile implements Mobile{
    @Override
    public void assemble() {
        System.out.println("Basic mobile features");
    }
}
