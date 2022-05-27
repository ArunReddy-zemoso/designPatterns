package decoratorDesign;

public class MobileDecorator implements Mobile{

    protected Mobile mobile;

    public MobileDecorator(Mobile mobile){
        this.mobile = mobile;
    }

    @Override
    public void assemble() {
        this.mobile.assemble();
    }
}
