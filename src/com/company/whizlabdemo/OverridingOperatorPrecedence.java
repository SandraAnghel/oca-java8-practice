package com.company.whizlabdemo;

public class OverridingOperatorPrecedence {
    public static void main(String[] args) {
        // Operator precedence may be overridden using parentheses
        int integer1 = 1 +2 * 3;
        int integer2 = (1 + 2) * 3;
        System.out.println(integer1);
        System.out.println(integer2);

        boolean boolean1 = true || true && false;
        boolean boolean2 = (true || true) && false;
        System.out.println(boolean1);
        System.out.println(boolean2);

        int i1 = 1;
        int i2= 2;
        int i = i2 = i1;
        System.out.println(i);

        int i3 = 1;
        int i4 = 2;
        int i5 = i4 * ++i3 * i3;
        System.out.println(i5);

        int s = 4 << 4 / 2;
        System.out.println(s);

    }
}
