package flyweightDesign;

public class BirdFactory {
    static AngryBird bird = null;
    public static AngryBird getBird(){
        if(bird == null){
            System.out.println("bird created");
            bird = new Terence();
        }
        return bird;
    }
}
