package com.company.whizlabdemo;

// Comparison of objects with overridden equals method
public class ComparisonUsingEqualsMethod2 {

    private int value;
    public ComparisonUsingEqualsMethod2(int value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        return this.value == ((ComparisonUsingEqualsMethod2)obj).value;
    }

    public static void main(String[] args) {
        ComparisonUsingEqualsMethod2 data1 = new ComparisonUsingEqualsMethod2(0);
        ComparisonUsingEqualsMethod2 data2 = new ComparisonUsingEqualsMethod2(0);
        System.out.println(data1.equals(data2));
    }
}
