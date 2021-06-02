package com.company.whizlabdemo;


/**     Class Declaration
 *  - public - access modifier, class is visible on a public level
 *  - class  - keyword used to define a class
 *  - ClassStructure - name of the class
 *  - {} - the class body
 *
 */
public class ClassStructure {
    // a field and a method may share the same name within the same class but it is not recommended because it can lead to unnecessary ambiguity
    String name;
    public void name() { }

    /*
        Fields
            - zero or more modifiers, such as public or private
            - the type of the field
            - the name of the field
     */
    int myField = 0;  // field declaration and initialization

    /*
        Methods
            - modifiers such as public or private
            - the return type if the method returns a value, or void otherwise
            - the method name
            - a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses();if there are no parameters,you must use empty parentheses
            - an exception list
            - the method body, enclosed between curly braces
     */
    void myMethod() {       // method declaration
        // do something
    }

    /*
        Constructors
            - used to create objects from the class blueprint
            - constructor declarations look like method declarations, except that they use the name of the class and have no return type
            - modifiers
            - must have the same name as the class its declared in
            - a comma-delimited list of input parameters
            - an exception list
            - constructor body {}
            - !!! default constructor has the same access modifier as its class
     */
    ClassStructure() {   // constructor declaration
        // do something
    }

   // class A implements C extends B{ }  - does not compile

   // class B { }

   // interface C { }
}
