/*
    package = keyword = specifies location of the class
            = used for logical grouping of classes
 */
package com.company.chapter1;

/**
 * public = keyword and access modifier = class is visible on public level
 * class  = keyword used to define a class
 * PrimitiveTypes = name of class
 */
public class PrimitiveTypes {

    /**
     * public = keyword and access modifier = method is visible on public level
     * static = keyword = no need of instance of the class
     *        = method can be called using the name of the class
     * void   = keyword and return type = method doesn't return anything
     * main   = name of method
     * @param args = list of String arguments
     */
    public static void main(String[] args) {

        boolean b1 = true;   // 1 bit
        boolean b2 = false;  // 1 bit

        byte bt1 = -128;   // 8 bits
        byte bt2 = 0;      // 8 bits
        byte bt3 = 127;    // 8 bits

        char c1 = 's';       // 16 bits
        char c2 = 'f';       // 16 bits
        char c3 = '\u0000';  // 16 bits
        char c4 = '\uFFFF';  // 16 bits


        short s1 = -32768;  // 16 bits
        short s2 = 0;       // 16 bits
        short s3 = 32767;   // 16 bits

        int i1 = -40500;   // 32 bits
        int i2 = 0;        // 32 bits
        int i3 = 90000;    // 32 bits

        long l1 = -9333264L;    // 64 bits
        long l2 = 0l;           // 64 bits
        long l3 = 9875625532L;  // 64 bits

        float f1 = -123.45f;  // 32 bits
        float f2 = 123.45f;   // 32 bits

        double d1 = -123.456;  // 64 bits
        double d2 = 123.456;   // 64 bits

    }
}
