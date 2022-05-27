package flyweightDesign;

public class Terence implements AngryBird{
    String power;
    @Override
    public void assignPower(String power) {
        this.power=power;
    }

    @Override
    public void showPower() {
        System.out.println(this.power);
    }
}
