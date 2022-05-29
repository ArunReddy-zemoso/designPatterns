package compositeDesign;

import java.util.ArrayList;
import java.util.List;

public class ProjectLead implements Employee{
    private int id;
    private String name;
    private List<Employee> employees;

    public ProjectLead(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public void Details() {
        employees.forEach(Employee::Details);
    }
}
