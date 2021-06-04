package com.company.whizlabdemo;

/**
 *  - an object can be destroyed using a technique called dereference by reassignment, making it eligible for garbage collection
 */
public class ObjectDestruction {
    int integer;
    ObjectDestruction(int integer) {
        this.integer = integer;
    }

    public static void main(String[] args) {
        ObjectDestruction destruction = new ObjectDestruction(0);
        destruction = null;  // this object will be destroyed from the memory by the garbage collector

        Test1 o1 = new Test1();
        Test1 o2 = new Test1(0);
        Test1 o3 = new Test1(0);
    }
    
}
