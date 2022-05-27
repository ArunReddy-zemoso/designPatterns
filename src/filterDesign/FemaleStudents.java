package filterDesign;

import java.util.ArrayList;
import java.util.List;

public class FemaleStudents implements Criteria{
    @Override
    public List<Student> meetCriteria(List<Student> students) {
        List<Student> femaleStudents = new ArrayList<Student>();
        for(Student student : students){
            if(student.getGender().equalsIgnoreCase("female")){
                femaleStudents.add(student);
            }
        }
        return femaleStudents;
    }
}
