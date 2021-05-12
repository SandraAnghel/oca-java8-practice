package com.company.chapter1;

/**
 *  class = keyword used to define a class
 *  Zoo = name of the class
 *  public = keyword and access modifier = specified that class is visible from other classes
 */
public class Zoo {
    /**
     * main = the place where the program execution begins(entry point)
     *      = the link between JVM and programmer's code
     * public = keyword and access modifier = specified that method is visible on public level(any place in the program)
     * static = keyword = no need of instance of the class for calling the method.Method can be called using the class name( Zoo.main(...) )
     * void = keyword and return type = specified that the method doesn't return anything
     * @param args = list of string parameters
     */
    public static void main(String[] args) {
        System.out.println("Welcome!");
        String firstArg = args[0];
        String secondArg = args[1];
        System.out.println("First argument is: " + firstArg + " ,Second argument is: " + secondArg);
    }
}
