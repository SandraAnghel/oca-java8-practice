package com.company.whizlabdemo;

/**
 * - the == operator compares objects by reference, implying that an equality test evaluates to true only if two objects in the comparison are the same
 */
public class ComparisonUsingEqualOperator {
    public static void main(String[] args) {
        String string1 = new String("Whizlabs");
        String string2 = "Whizlabs";
        String string3 = "Whizlabs";
        System.out.println(string1 == string2);
        System.out.println(string2 == string3);
    }
}
