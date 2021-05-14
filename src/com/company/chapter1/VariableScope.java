/*
    package = keyword = specifies location of the class
            = used for logical grouping of classes
 */
package com.company.chapter1;

/**
 * public = keyword and access modifier = class is visible on public level
 * class  = keyword used to define a class
 * VariableScope = name of the class
 */
public class VariableScope {

    String name;  // instance variable/ field
    static int MAX_LENGTH = 5;  // class variable

    public void calculateSalary() {
        /*
           int numberHours;
           int salary = numberHours * 8;  - it doesn't compile - local variable needs to be initialized
         */

        name = "test";
    }

    public static void main(String[] args) {
        VariableScope vs = new VariableScope(); // local variable - exists only in main method
        vs.calculateSalary();
        vs.findAnswer(false);
        // vs.eatIfHungry(true);
        System.out.println(VariableScope.MAX_LENGTH);
        VariableScope.MAX_LENGTH = 6;
        VariableScope vs1 = new VariableScope();
        System.out.println(VariableScope.MAX_LENGTH);
        vs1.eatIfHungry(false);
        System.out.println(VariableScope.MAX_LENGTH);
    }

    public void findAnswer(boolean check) {
        int answer; // local variable - exists only in findAnswer method
        int onlyOneBranch; // local variable - exists only in findAnswer method

        if (check) {
            onlyOneBranch = 1;
            answer = 1;
            int t = 2; // local variable - exists only in this block of code
        } else {
            answer = 2;
        }

        System.out.println(answer);
        //  System.out.println(onlyOneBranch); - doesn't compile - onlyOneBranch is not initialized when check is false
        // System.out.println(t);  - doesn't compile
    }

    public void eatIfHungry(boolean hungry) { // hungry is local variable
       int x = 1; // local variable
        if(hungry) {
            int bitesOfCheese = 1; // local variable
        } // bitesOfCheese goes out of scope here

        // System.out.println(bitesOfCheese); - does not compile
        VariableScope.MAX_LENGTH = 9;
    }

    // Initializer
    {
       // vs.  - doesn't compile
    }

}
