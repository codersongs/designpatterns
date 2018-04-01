package com.codersongs.designpatterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria{
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (GenderEnum.MALE == person.getGender()){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
