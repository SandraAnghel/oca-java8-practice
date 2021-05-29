package com.company.chapter2;

public class RelationalOperators {
    int x = 10, y = 20, z = 10;
    {
        System.out.println(x < y); // Outputs true
        System.out.println(x <= y); // Outputs true
        System.out.println(x >= z); // Outputs true
        System.out.println(x > z); // Outputs false
    }
    {
        String a = "test";
        System.out.println(a instanceof String); // true
        System.out.println(a instanceof Object); // true
    }
}
