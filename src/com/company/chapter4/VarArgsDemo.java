package com.company.chapter4;

public class VarArgsDemo {

    public static void main(String[] args) {
        do1(2);
        do2();
        do2(2);
        do2(2,6);
        do2(3,6,77);
        do3(2);
        do3(2,5);
        // do4(2,2);
       //  do5(2,3, "");
    }

    static void do1(int step) { }

   static void do2(int... steps) {
        int noOfArgs = steps.length;
        System.out.println(noOfArgs);
        if(noOfArgs > 0) {
            int first = steps[0];
            System.out.println(first);
        }
   }

   static void do3(int step, int... steps) {}

   // static void do4(int... steps, int step) {}
   //  static void do5(int...steps, String... name) {}
}
