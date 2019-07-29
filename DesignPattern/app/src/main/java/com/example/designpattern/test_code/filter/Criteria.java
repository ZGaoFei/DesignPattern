package com.example.designpattern.test_code.filter;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> list);
}
