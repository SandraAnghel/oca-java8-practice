package com.company.whizlabdemo;

/**
 * - the scope of a variable is the section of the program in which the variable is visible
 * - variable identifiers are statically scoped, i.e the scope of a variable is determined at compile time
 */

/**
 *      Class-Level Scope
 * - also known as fields, are declared inside a class and outside any method
 * - is accessible from anywhere within the class and maybe from the outside provided a suitable modifier is in place
 */

public class VariableScope {
    // int number1 = 0;   class-level variable scope
    static int no1 = 0;

    public static void main(String[] args) {
        {
            int no2 = 0;
        }
        System.out.println(no1);
        // System.out.println(no2);  - does not compile because variable no2 has a block-level scope and it is visible only in its block
        // System.out.println(no3);  - does not compile because variable no3 it is declared and initialized after the print statement
        int no3 = 0;
    }


    /**
     *     Method-Level Scope
     * - variables declared inside a method, also known as local variables, are scoped to the method and visible since their declarations until the method returns
     * - method parameters are no different from local variables,the only difference is that they are declared as part of the method signature and initialized when the method gets invoked
     */
    void myMethod() {
        int number2 = 0;  // method-level variable scope (local variable)

        /**
         *     Block-Level Scope
         * - a block-level scope is defined by a pair of curly brackets
         * - can only be accessed since its declaration until the closing bracket and inaccessible to the code outside the block
         */
        {
            int number3 = 0;  // block-level variable scope
        }
    }

    public static void q3() {
        int n1 = 0;
        {
          //  int n1 = 1;
        }
        System.out.println(n1);
    }

}
