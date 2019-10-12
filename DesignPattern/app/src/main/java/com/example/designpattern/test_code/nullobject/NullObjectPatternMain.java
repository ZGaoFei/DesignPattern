package com.example.designpattern.test_code.nullobject;

public class NullObjectPatternMain {

    public static void main(String[] args) {
        AbstractCustomer zhangsan = CustomerFactory.getCustomer("zhangsan");
        AbstractCustomer lisi = CustomerFactory.getCustomer("lisi");
        AbstractCustomer wanger = CustomerFactory.getCustomer("wanger");
        AbstractCustomer mazi = CustomerFactory.getCustomer("mazi");

        System.out.println("Customers");
        System.out.println(zhangsan.getName());
        System.out.println(lisi.getName());
        System.out.println(wanger.getName());
        System.out.println(mazi.getName());
    }
}
