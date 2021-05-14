/*
    package = keyword = specifies location of the class
            = used for logical grouping of classes
 */
package com.company.chapter1;

import java.nio.charset.StandardCharsets;

/**
 * public = keyword and access modifier = class is visible on public level
 * class  = keyword used to define a class
 * ReferenceTypes = name of class
 */
public class ReferenceTypes {

    /**
     * public = keyword and access modifier = method is visible on public level
     * static = keyword = no need of instance of the class
     * = method can be called using the name of the class
     * void   = keyword and return type = method doesn't return anything
     * main   = name of method
     * * @param args = list of String parameters
     */
    public static void main(String[] args) {

        // int a = null; - primitive values cannot be null
        String s = null;
        String reference = "Hello";
        String lowerReference = reference.toLowerCase();
        int length = reference.length();
        String upperReference = reference.toUpperCase();
        byte[] byteReference = reference.getBytes();
        int b = 3;

    }
}
