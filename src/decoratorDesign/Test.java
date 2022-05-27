package decoratorDesign;

public class Test {
    public static void main(String[] args) {
        Mobile m1= new SmartMobile(new BasicMobile());
        m1.assemble();
    }
}
