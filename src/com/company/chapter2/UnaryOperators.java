package com.company.chapter2;

public class UnaryOperators {
    public static void main(String[] args) {

        int i1 = +1;
        int i2 = -1;
        int i3 = 0;
        i3++;  // increment by 1
        int i4 = 5;
        i4--;  // decrement by 1
        boolean i5 = false;
        boolean i6 = !i5;
        int i7 = -(-8); // +8
        int i8 = -(+9); // -9
        int i9 = +(-10); // -10
        int i10 = +0;
        int i11 = -0;
        /**
         * int x = !5; -> Does not compile
         * boolean y = -false; -> Does not compile
         * boolean z = !0; -> Does not compile
         */

        // Increment and decrement operators - highest order
        // ++x pre-increment
        // --x pre-decrement
        // x++ post-increment
        // x-- post-decrement

        int counter = 0;
        System.out.println(counter); // 0
        System.out.println(++counter); // 1
        System.out.println(counter); // 1
        System.out.println(counter--); // 1
        System.out.println(counter);  // 0

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        y = (++x) * 5 / x-- + --x;
        y = 4 * 5 / x-- + --x; // x = 4

        y = 4 * 5 / 4 + --x; // x = 3
        y = 4 * 5 / 4 + 2; // x = 2
        y = 20 / 4 + 2;
        y = 5 + 2;
        y = 7;
        System.out.println("x is " + x); // x = 2
        System.out.println("y is " + y); // y = 7
    }
}
