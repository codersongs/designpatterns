package com.codersongs.designpatterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria{
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singleList = new ArrayList<Person>();

        for (Person person : persons) {
            if (MaritalStatusEnum.SINGLE == person.getMaritalStatus()) {
                singleList.add(person);
            }
        }
        return singleList;
    }
}
