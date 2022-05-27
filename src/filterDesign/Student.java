package filterDesign;

public class Student {
    private String name;
    private String gender;
    private String branch;

    public Student(String name, String gender, String branch) {
        this.name = name;
        this.gender = gender;
        this.branch = branch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
