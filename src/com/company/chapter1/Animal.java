package com.company.chapter1;

/**
 *  class = keyword used to define a class
 *  Animal = the name of the class
 * @author Sandra 
 * @<code> </code>
 */
public class Animal {
    // fields(variables)

    String name;


    // methods

    /**
     * String = return type
     * getName = name of the method
     * the method doesn't have parameters
     * @return = the method returns a string value
     */
    public String  getName() {
        return name;
    }

    /**
     * setName = name of the method
     * void = special return type = method doesn't return anything
     * @param newName = required parameter when the method is called
     */
    public void setName(String newName) {
        name = newName;
    }

    // Single line comment
    /*
        Multiline
        comment

     */

    // /* Test single line comment */

    /*
      // Test multiline comment
     */
}
