package com.company.whizlabdemo;

/**
 *  - the ternary operator is shorthand for the if-then-else construct with the syntax:
 *      condition ? value1 : value2  -> if the condition is evaluated to true then print value1 else if the condition is evaluated to false print value2
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int i = 1;
        String output = i > 0 ? "Positive" : "Non-positive";
        System.out.println(output);

        int i1 = 1;
        short s = 2;
        int number = i1 > s ? i1 : s;
        System.out.println(number);
    }
}
