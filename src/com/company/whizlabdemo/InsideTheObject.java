package com.company.whizlabdemo;

public class InsideTheObject {

    String myField = "I am an object field";
     String name = "Tom";

    // Read a field
    String getMyField() {
        return myField;
    }

    /*
        if the field is not shadowed by any local variables, the this. keyword may be left out
     */
    // Write a field
    void setMyField() {
        myField = "I have been changed";
    }

    // Read a field
    String getName() {
        return name;
    }

    /*
        this keyword is to eliminate the confusion between class attributes and parameters with the same name
        because a class attribute is shadowed by a method or constructor parameter
     */
    // Write a field
    void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // the myFieldOutside field may be changed from outside its enclosing object
        OutsideTheObject myObject = new OutsideTheObject();
        myObject.setMyFieldOutside("Changed from outside");
        System.out.println(myObject.getMyFieldOutside());
        InsideTheObject myInsideObject = new InsideTheObject();
        System.out.println(myInsideObject.myField);
        System.out.println(myInsideObject.name);
        myInsideObject.test();
        myInsideObject.myMethod();

    }

    public void test() {
        System.out.println(this.myField);
        System.out.println(this.name);
    }

    private int no1 = 0;
     public void myMethod() {
         int no1 = 1;
         System.out.println(this.no1);
     }
}
