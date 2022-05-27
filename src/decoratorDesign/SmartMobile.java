package decoratorDesign;

public class SmartMobile extends MobileDecorator{

    public SmartMobile(Mobile mobile) {
        super(mobile);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding smart phone features");
    }
}
