package com.company.whizlabdemo;

public class Variables {
    /**
     *  Class-Level Variables
     *      - are declared and initialized at the same time
     *      - if you declare a variable without initializing it, the compiler will set the variable to a reasonable default value based on its type
     *      - Default values for variables of varous data types:
     *          - byte, short, int, long: 0
     *          - float, double: 0.0
     *          - char: '\u0000'
     *          - boolean: false
     *          - Object: null
     */

    Object myObject;               // class level variable
    static int myInt = 0;         // class level variable


    /**
     *  Local Variables
     *      - are used to store temporary states within methods or blocks
     *      - they must be declared and explicitly initialized before being used
     *      - a local variable may be initialized anywhere after it is declared and before the enclosing method/block ends
     */
    public void myMethod() {
        char myChar = 'a';             // local variable
        boolean myBoolean = false;     // local variable
        // do something
    }
}
