package com.codersongs.designpatterns.criteria;

import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria criteriaOne;
    private Criteria criteriaOther;

    public AndCriteria(Criteria criteriaOne, Criteria criteriaOther){
        this.criteriaOne = criteriaOne;
        this.criteriaOther = criteriaOther;
    }
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> itemListOne = criteriaOne.meetCriteria(persons);
        return criteriaOther.meetCriteria(itemListOne);
    }
}
