package com.company.chapter1;

public class GCDemo {

    /*
       Garbage Collection - the process of automatically cleaning the HEAP Memory
                          - only for Objects(reference type)
     */

    public static void main(String[] args) {
        runGC();
    }

    public static void runGC() {
        Object o = new Object();
        System.gc();
        System.out.println(o);
        o = null;
        System.out.println(o);
    }
}
