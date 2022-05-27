package filterDesign;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Robert", "Male", "cse"));
        students.add(new Student("John", "Male", "cse"));
        students.add(new Student("Mike", "Male", "eee"));
        students.add(new Student("Bobby", "Male", "eee"));
        students.add(new Student("Laura", "Female", "eee"));
        students.add(new Student("Diana", "Female", "cse"));

        //printPersons(persons);

        Criteria male = new MaleStudents();

        System.out.println("Males: ");
        printStudents(male.meetCriteria(students));

        Criteria female = new FemaleStudents();

        System.out.println("\nFemales: ");
        printStudents(female.meetCriteria(students));

        Criteria cseStudents = new CSEStudents();

        System.out.println("\nCSE Stundents: ");
        printStudents(cseStudents.meetCriteria(students));

        Criteria eeeStudents = new EEEStudents();

        System.out.println("\nEEE Students: ");
        printStudents(eeeStudents.meetCriteria(students));

        Criteria cseMale = new AndFiltering(cseStudents, male);

        System.out.println("\nCse  and Male: ");
        printStudents(cseMale.meetCriteria(students));

        Criteria cseFemale = new AndFiltering(cseStudents, female);

        System.out.println("\nCse  and Female: ");
        printStudents(cseFemale.meetCriteria(students));


    }

    public static void printStudents(List<Student> students)
    {
        for (Student student : students)
        {
            System.out.println("Student : [ Name : " + student.getName() + ", Gender : " + student.getGender() + ", Branch: " + student.getBranch() + " ]");
        }
    }
}
