package prototypeDesign;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        MobileShop mobile1=new MobileShop();
        mobile1.insertData();

        MobileShop mobile2=(MobileShop)mobile1.clone();

        mobile2.getMobiles().add("oneplus 7pro");
        System.out.println(mobile1.toString());
        System.out.println(mobile2.toString());
    }
}
