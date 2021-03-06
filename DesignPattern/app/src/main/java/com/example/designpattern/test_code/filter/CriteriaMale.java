package com.example.designpattern.test_code.filter;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> personList = new ArrayList<>();
        for (Person person : list) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                personList.add(person);
            }
        }
        return personList;
    }
}
