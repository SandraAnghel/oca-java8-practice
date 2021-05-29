package com.company.chapter2;

public class AssignmentOperators {
    public static void main(String[] args) {
        int i1 = 1;
        // int i2 = 1.0 ; - Does not compile
        // short i3 = 1921222; - Does not compile
       // int i4 = 9f; - Does not compile
        int i5 = (int)1.0;
        short i6 = (short)1921222; // Stored as 20678
        int i7 = (int)9l;

        int x = 2, z = 3;
        x = x * z; // Simple assignment operator
        x *= z; // Compound assignment operator

        long x1 = 5;
        long y = (x1=3);
        System.out.println(x1); // Outputs 3
        System.out.println(y); // Also, outputs 3
        int i9;
        int i8 = i9 = 10;

        int i10 = 3 + (i9 = 11);



    }
}
