package com.company.whizlabdemo;

import static com.company.whizlabdemo.Data.primitiveMethod;
import static com.company.whizlabdemo.Data.referenceMethod;

public class Test {

    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = data1;
        int int1 = 0;
        int int2 = int1;
        data1.value = 1;
        int1 = 1;
        System.out.println(data2.value);
        System.out.println(int2);
        System.out.println("---------------");

        Data data3 = new Data();
        int i = 0;
        referenceMethod(data3);
        primitiveMethod(i);
        System.out.println(data3.value1);
        System.out.println(i);
        System.out.println("-------------------");


        objectBuilder();
        primitiveBuilder();

    }

    public static Object objectBuilder() {
        Object object = new Object();    // local variable
        return object;
    }

    public static int primitiveBuilder() {
        int integer = 0;    // local variable
        return integer;
    }



}
