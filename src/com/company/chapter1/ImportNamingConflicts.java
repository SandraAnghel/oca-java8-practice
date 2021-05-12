/*
  package = keyword = specifies the location of the class
          = used by java for logical grouping of class
 */
package com.company.chapter1;

// import java.util.*; - it is not working because Date class is ambiguous
// import java.sql.*;  - it is not working because Date class is ambiguous
import java.util.Date;

// import java.util.Date;
// import java.sql.Date;  - The import java.sql.Date collides with another import statement

/**
 * public = keyword and access modifier = class is visible on public level
 * class = keyword used to define a class
 * ImportNamingConflicts = name of class
 */
public class ImportNamingConflicts {
    /**
     * public = keyword and access modifier = method is visible on public level
     * static = keyword = no need of instance of the class
     *        = method can be called using the name of the class
     * void = keyword and return type = method doesn't return anything
     * main = name of method
     * @param args = list of string parameters
     */
    public static void main(String[] args) {
        Date date = new Date();
    }
}
