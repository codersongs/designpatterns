package com.codersongs.designpatterns.criteria;

import com.sun.tools.javah.Gen;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器/标准模式(Filter/Criteria)
 * <p>
 * 顾名思义，这是一种根据条件查找或筛选对象的模式，常见的应用茹Hibernate的条件查询和MongoTemplate
 * 的条件查询
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert",GenderEnum.MALE, MaritalStatusEnum.SINGLE));
        persons.add(new Person("John",GenderEnum.MALE,  MaritalStatusEnum.MARRIED));
        persons.add(new Person("Laura",GenderEnum.FEMAIL, MaritalStatusEnum.MARRIED));
        persons.add(new Person("Diana",GenderEnum.FEMAIL, MaritalStatusEnum.MARRIED));
        persons.add(new Person("Mike",GenderEnum.FEMAIL, MaritalStatusEnum.SINGLE));
        persons.add(new Person("Bobby", GenderEnum.MALE, MaritalStatusEnum.SINGLE));

        Criteria male = new MaleCriteria();
        Criteria female = new FemaleCriteria();
        Criteria single = new SingleCriteria();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
