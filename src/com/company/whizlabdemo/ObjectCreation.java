package com.company.whizlabdemo;

/**
 *  - the creation of an object includes two steps:
 *      1. instantiation is done with the new operator
 *      2. initialization is implemented by constructors
 */
public class ObjectCreation {
    int integer;
    ObjectCreation(int integer) {
        this.integer = integer;
    }

    public static void main(String[] args) {
        ObjectCreation createdObject = new ObjectCreation(0);
    }
}
