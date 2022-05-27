package filterDesign;

import java.util.ArrayList;
import java.util.List;

public class CSEStudents implements Criteria{
    @Override
    public List<Student> meetCriteria(List<Student> students) {
        List<Student> cseStudents = new ArrayList<Student>();
        for(Student student : students){
            if(student.getBranch().equalsIgnoreCase("cse")){
                cseStudents.add(student);
            }
        }
        return cseStudents;
    }
}
