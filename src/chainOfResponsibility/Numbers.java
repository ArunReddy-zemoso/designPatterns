package chainOfResponsibility;

public class Numbers {
    private int x;
    private int y;

    private String operation;

    public Numbers(int x, int y, String operation) {
        this.x = x;
        this.y = y;
        this.operation = operation;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getOperation() {
        return operation;
    }

    public void setOpetation(String operation) {
        this.operation = operation;
    }
}