package filterDesign;

import java.util.ArrayList;
import java.util.List;

public class MaleStudents implements Criteria{
    @Override
    public List<Student> meetCriteria(List<Student> students) {
        List<Student> maleStudents = new ArrayList<Student>();
        for(Student student : students){
            if(student.getGender().equalsIgnoreCase("male")){
                maleStudents.add(student);
            }
        }
        return maleStudents;
    }
}
