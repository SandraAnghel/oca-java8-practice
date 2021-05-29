package com.company.chapter2;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // + -> addition
        // - -> subtraction
        // * -> multiplication
        // / -> division
        // % -> modulus

        int x = 2 * 5 + 3 * 4 - 8;
        x = 10 + 12 - 8;
        x = 22 - 8;
        x = 14;

        int y = 2 * ((5 + 3) * 4 - 8);
        y = 2 * (8 * 4 - 8);
        y = 2 * (32 - 8);
        y = 2 * 24;
        y = 48;

        String z = "test";
        String c = z + 2;  // - "test2"

        int i1 = 5;
        i1 += 2; // i1 = i1 + 2;

        // i2 = int + double;

        // i3 = byte + byte -> int
        // i4 = short + short -> int
        // i5 = char + char -> int
        // i6 = byte + short -> int
        // i7 = byte + double -> double
    }
}
