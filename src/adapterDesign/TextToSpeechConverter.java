package adapterDesign;

public class TextToSpeechConverter {
    Text text = new Text();
    Speech speech = new Speech();

    public void execute() {
        text.setMessage("hi arun");
        speech.setMessage(text.getMessage());
        speech.speak();
    }
}
