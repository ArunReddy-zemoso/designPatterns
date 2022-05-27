package adapterDesign;

public class Speech {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void speak(){
        System.out.println("speaking...");
        System.out.println(getMessage());
    }
}
