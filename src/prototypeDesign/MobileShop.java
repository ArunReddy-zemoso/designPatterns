package prototypeDesign;

import java.util.ArrayList;
import java.util.List;

public class MobileShop implements Cloneable{
    private List<String> mobiles;

    public MobileShop(){
        this.mobiles=new ArrayList<>();
    }

    public MobileShop(List<String> mobiles){
        this.mobiles=mobiles;
    }

    public void insertData(){
        mobiles.add("Samsung s20");
        mobiles.add("Mi A1");
        mobiles.add("Lava Iris X8");
        mobiles.add("IQOO Z3");
    }

    public List<String> getMobiles(){
        return this.mobiles;
    }

    public Object clone() throws CloneNotSupportedException{
        List<String> temp=new ArrayList<>();
        temp.addAll(this.mobiles);
        return new MobileShop(temp);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "mobiles=" + mobiles +
                '}';
    }
}
