package design.pattern.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rittick on 4/29/2017.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> singlePersons = new ArrayList<>();
        for(Person person: persons){
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
