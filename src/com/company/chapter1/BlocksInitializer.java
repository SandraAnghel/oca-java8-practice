/*
    package = keyword = specifies location of the class
            = used for logical grouping of classes
 */
package com.company.chapter1;

/**
 * public = keyword and access modifier = class is on public level
 * class  = keyword used to define a class
 * BlockInitializer = name of class
 */
public class BlocksInitializer {

    {
        System.out.println("Initializer 1");
    }

    String s = "Test";

    {
        System.out.println("Initializer 2");
    }

    public static void main(String[] args) {

        BlocksInitializer i1 = new BlocksInitializer();
        {
            System.out.println("-----");
            BlocksInitializer i2 = new BlocksInitializer();
            System.out.println("Initializer 3");
        }
    }

    {
        System.out.println("Initializer 4");
    }
}
