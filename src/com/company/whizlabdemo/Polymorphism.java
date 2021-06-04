package com.company.whizlabdemo;

// Subclasses of a class can define their own unique behavior, yet share some of the same functionality of the parent class

public class Polymorphism {
    public void myMethod(){/* do something*/}
}

 class SubClass1 extends Polymorphism {
    public void myMethod() {/* do something else - defined by SubClass1*/}
}

class SubClass2 extends Polymorphism {
    public void myMethod() {/* do something else - defined by SubClass2*/}
}
