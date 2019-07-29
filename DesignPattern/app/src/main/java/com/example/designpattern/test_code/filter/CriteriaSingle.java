package com.example.designpattern.test_code.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> personList = new ArrayList<>();
        for (Person person : list) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                personList.add(person);
            }
        }
        return personList;
    }
}
