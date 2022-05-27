package prototypeDesign;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MobileShop mobileShop1=new MobileShop();
        mobileShop1.insertData();

        MobileShop mobileShop2=(MobileShop)mobileShop1.clone();

        mobileShop2.getMobiles().add("oneplus 7pro");
        System.out.println(mobileShop1.toString());
        System.out.println(mobileShop2.toString());
    }
}
