package filterDesign;

import java.util.List;

public class AndFiltering implements Criteria
{

    private Criteria criteria1;
    private Criteria criteria2;

    public AndFiltering( Criteria criteria1, Criteria criteria2 )
    {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Student> meetCriteria( List<Student> students )
    {
        List<Student> firstCriteriaPersons = criteria1.meetCriteria(students);
        return criteria2.meetCriteria(firstCriteriaPersons);
    }
}