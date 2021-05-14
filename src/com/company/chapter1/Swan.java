/*
    package = keyword = specifies the location of the class
            = used for logical grouping of classes
 */
package com.company.chapter1;

/**
 *  public = keyword and access modifier = class is visible on public level
 *  class  = keyword used to define a class
 *  Swan   = name of class
 */
public class Swan {

        String name = "hardcoded name";  // instance field/ variable
        int numberEggs;
        boolean hasEggs = numberEggs > 0 ? true : false; // ternary operator
        boolean isAdult;


    /**
     * public = keyword and access modifier = method is visible on public level
     * static = keyword = no need of instance of the class
     *        = method can be called using the name of the class
     * void   = keyword and return type = method doesn't return anything
     * main   = name of method
     * @param args = list of String parameters
     */
    public static void main(String[] args) {
        Swan swan = new Swan();
        // Read instance fields
        System.out.println(swan.name);
        System.out.println(swan.numberEggs);
        System.out.println(swan.hasEggs);
        System.out.println(swan.isAdult);

        // Set/ Write instance fields
        swan.name = "Test";
        swan.numberEggs = 3;
        swan.isAdult = true;

        System.out.println(swan.name);
        System.out.println(swan.numberEggs);
        System.out.println(swan.hasEggs);
        System.out.println(swan.isAdult);
    }
}
