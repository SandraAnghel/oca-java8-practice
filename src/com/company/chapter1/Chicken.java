/*
    package = keyword = specifies the location of the class
            = used for logical grouping of classes
 */
package com.company.chapter1;

/**
 * public = keyword and access modifier = class is visible on public level
 * class  = keyword used to define a class
 * Chicken = name of class
 */
public class Chicken {
    String name = "Test";   // Initialized on line

    public Chicken() {
        String s = "";
        /*
           Constructor without parameters
           This is a constructor because:
                                 - it has exactly the same name as the class name
                                 - it doesn't have return type
         */
        String defaultName = name;
        name = "New name";  // Initialized in constructor
    }

    public Chicken(String name) {
        /*
           Constructor with one parameter of type String
           This is a constructor because:
                                 - it has exactly the same name as the class name
                                 - it doesn't have return type
         */
        this.name = name;
    }

    public void Chicken() {
        /*
           This is not a constructor because it has return type
         */
    }



}
