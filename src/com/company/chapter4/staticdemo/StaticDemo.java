package com.company.chapter4.staticdemo;
import static java.lang.System.*;

public class StaticDemo {
    // static StaticDemo(){}
    static int counter;
    int instanceCounter;

    static void incrementCounter() {
        StaticDemo.counter++;
    }

    int getCounter() {
        return counter;
    }

    /*static int getInstanceCounter() {
        static int b = 1;
        int c = getCounter();
        return instanceCounter;
    }*/

    {
        int i = 1;
        StaticDemo.incrementCounter();
    }

   static  {
       // static int i2 = 2;
        int i2 = 2;
        // getCounter();
       out.println("A");
    }
}

// static class A{ }


