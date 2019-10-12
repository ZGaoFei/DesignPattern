package com.example.designpattern.test_code.nullobject;

public class CustomerFactory {

    private static final String[] names = {"zhangsan", "lisi", "wanger"};

    public static AbstractCustomer getCustomer(String name) {
        for (String nameStr : names) {
            if (nameStr.equalsIgnoreCase(name)) {
                return new RealCustomer(nameStr);
            }
        }

        return new NullCustomer();
    }
}
