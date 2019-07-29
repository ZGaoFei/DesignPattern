package com.example.designpattern.test_code.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMain {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Robert", "Male", "Single"));
        list.add(new Person("John", "Male", "Married"));
        list.add(new Person("Laura", "Female", "Married"));
        list.add(new Person("Diana", "Female", "Single"));
        list.add(new Person("Mike", "Male", "Single"));
        list.add(new Person("Bobby", "Male", "Single"));

        CriteriaMale male = new CriteriaMale();
        CriteriaFemale female = new CriteriaFemale();
        CriteriaSingle single = new CriteriaSingle();
        AndCriteria and = new AndCriteria(male, single);
        OrCriteria or = new OrCriteria(female, single);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(list));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(list));

        System.out.println("\nSingle Males: ");
        printPersons(and.meetCriteria(list));

        System.out.println("\nSingle Or Females: ");
        printPersons(or.meetCriteria(list));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    + ", Gender : " + person.getGender()
                    + ", Marital Status : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
