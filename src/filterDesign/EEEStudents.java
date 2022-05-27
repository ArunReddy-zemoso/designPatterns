package filterDesign;

import java.util.ArrayList;
import java.util.List;

public class EEEStudents implements Criteria{
    public List<Student> meetCriteria(List<Student> students) {
        List<Student> eeeStudents = new ArrayList<Student>();
        for(Student student : students){
            if(student.getBranch().equalsIgnoreCase("eee")){
                eeeStudents.add(student);
            }
        }
        return eeeStudents;
    }
}
