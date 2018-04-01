package com.codersongs.designpatterns.criteria;

public class Person {
    private String name;
    private GenderEnum gender;
    private MaritalStatusEnum maritalStatus;

    public Person(String name, GenderEnum gender, MaritalStatusEnum maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public MaritalStatusEnum getMaritalStatus() {
        return maritalStatus;
    }
}
