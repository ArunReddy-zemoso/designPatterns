package compositeDesign;

public class QAEngineer implements Employee{
    private int id;
    private String name;

    public QAEngineer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Details() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "QAEngineer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
