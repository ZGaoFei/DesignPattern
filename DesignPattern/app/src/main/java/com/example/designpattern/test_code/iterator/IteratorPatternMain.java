package com.example.designpattern.test_code.iterator;

import java.util.ArrayList;

public class IteratorPatternMain {

    public static void main(String[] args) {
        NameRepository repository = new NameRepository();

        for (Iterator<String> iterator = repository.getIterator(); iterator.hasNext(); ) {
            String name = iterator.next();
            System.out.println("name: " + name);
        }

        AgeRes ages = new AgeRes();
        Iterator<Integer> iterator = ages.getIterator();
        for (; iterator.hasNext(); ) {
            Integer age = iterator.next();
            System.out.println("age: " + age);
        }

        ArrayList<String> list = new ArrayList<>();
        java.util.Iterator<String> iterator1 = list.iterator();
    }
}
