package com.company.whizlabdemo;


/**
 *  - the equals method is defined in the Object class, comparing objects based on how it is overridden in these objects' blueprint classes;
 *  - if not overridden it compares objects the same way as the == operator does
 */
public class ComparisonUsingEqualsMethod {
    private int value;
    public ComparisonUsingEqualsMethod(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        ComparisonUsingEqualsMethod data1 = new ComparisonUsingEqualsMethod(0);
        ComparisonUsingEqualsMethod data2 = new ComparisonUsingEqualsMethod(0);
        System.out.println(data1.equals(data2));
    }
}
