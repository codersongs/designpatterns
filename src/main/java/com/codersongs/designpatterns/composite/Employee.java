package com.codersongs.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private String dept;
    private Integer salary;
    private List<Employee> subordinates = new ArrayList<Employee>();

    public Employee(String name, String dept, Integer salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public void add(Employee employee){
        this.subordinates.add(employee);
    }

    public void remove(Employee employee){
        this.subordinates.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
