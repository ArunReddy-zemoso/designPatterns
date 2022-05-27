package adapterDesign;

public class Text {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void textMessage(String message) {
        System.out.println("message: "+getMessage());
    }

}
