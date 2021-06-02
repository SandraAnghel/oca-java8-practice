package com.company.whizlabdemo;

import java.util.Locale;

// a class with the public scope modifier
public class AppExecutor {

    // a main method - entry point of the application
    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println(arg.toUpperCase() + " ");
        }
    }

    /**
     *  Compilation and Execution
     *      - name the file containing source code after the public class name
     *      - compile the source file into a Java class file using a Java compiler
     *      - execute the application using a Java application launcher tool
     */
}
