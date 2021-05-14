/*
   First line in the file
   Not mandatory - depends on the project structure
 */
package com.company.chapter1;


/*
    Immediately after the package
 */

import java.util.*;
import java.io.*;
import java.math.*;
import java.sql.*;

public class ClassOrder {
    // fields
    // String x;
    // static String y;

    // methods
}

class FirstClass {
    // methods

    // fields
    // String x;
    // static String y;
}


class SecondClass {
    // import java.util.*; - does not compile
}

class ThirdClass {
   // package com.company.chapter1; - does not compile
   // import java.util.*; - does not compile
   // package -> imports -> class definition -> inside class: fields and methods
}

class FourthClass {

}

/* - does not compile - method must be declared inside of a class
public void outOfClass() {

}*/

// static String z; - any field/ instance variable or class variable or local variable must be declared inside of a class
