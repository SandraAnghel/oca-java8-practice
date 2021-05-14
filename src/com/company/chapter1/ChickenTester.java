/*
    package = keyword = specifies location of the class
            = used for logical grouping of classes
 */
package com.company.chapter1;

/**
 * public = keyword and access modifier = class is visible on public level
 * class  = keyword used to define a class
 * ChickenTester = name of class
 */
public class ChickenTester {

    /**
     * public = keyword and access modifier = method is visible on public level
     * static = keyword = no need of instance of the class, method can be called using the name of the class
     * void   = keyword and return type = method doesn't return anything
     * main   = name of method
     * @param args = list of String parameters
     */
    public static void main(String[] args) {

        Chicken chicken = new Chicken();
        Chicken namedChicken = new Chicken("Tester");


    }
}
