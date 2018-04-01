package com.codersongs.designpatterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria{
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femaleList = new ArrayList<Person>();
        for (Person person : persons) {
            if (GenderEnum.FEMAIL == person.getGender()) {
                femaleList.add(person);
            }
        }
        return femaleList;
    }
}
