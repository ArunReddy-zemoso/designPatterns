package flyweightDesign;

public class Test {
    public static void main(String[] args) {
        String[] powers = {"strength","bomb","speed","clone"};
        for(int i=0;i<4;i++){
            AngryBird bird = BirdFactory.getBird();
            bird.assignPower(powers[i]);
            bird.showPower();
        }
    }
}
