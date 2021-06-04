package com.company.whizlabdemo;

public class Data {
    public int value;
    public int value1;

    public static void referenceMethod(Data data) {
        data.value1++;
    }

    public static void primitiveMethod(int i) {
        i++;
       // System.out.println(i);
    }

}
