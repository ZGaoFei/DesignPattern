package com.example.designpattern.test_code.filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> list) {
        List<Person> first = criteria.meetCriteria(list);
        List<Person> others = otherCriteria.meetCriteria(list);
        for (Person person : others) {
            if (!first.contains(person)) {
                first.add(person);
            }
        }
        return first;
    }
}
