package com.company.whizlabdemo;

// hiding certain details and showing only essential features of the object

public abstract class Abstraction {
    public abstract void myMethod();
}

class Abstraction2 extends Abstraction{
    public void myMethod(){
        // do something
    }
}
