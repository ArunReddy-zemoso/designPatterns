package compositeDesign;

public class Company {
    public static void main(String[] args) {
        Employee ram = new Developer(1,"ram");
        Employee ravi = new Tester(2,"ravi");
        Employee kumar = new QAEngineer(3,"kumar");

        ProjectLead arun = new ProjectLead(4,"arun");

        arun.addEmployee(ram);
        arun.addEmployee(ravi);
        arun.addEmployee(kumar);

        arun.Details();

    }
}
