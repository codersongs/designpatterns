package com.codersongs.designpatterns.criteria;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteriaOne;
    private Criteria criteriaOther;

    public OrCriteria(Criteria criteriaOne, Criteria criteriaOther){
        this.criteriaOne = criteriaOne;
        this.criteriaOther = criteriaOther;
    }

    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> itemListOne = criteriaOne.meetCriteria(persons);
        List<Person> itemListTwo = criteriaOther.meetCriteria(persons);
        for (Person person : itemListTwo) {
            if (!itemListOne.contains(itemListTwo)) {
                itemListOne.add(person);
            }
        }
        return itemListOne;
    }
}
