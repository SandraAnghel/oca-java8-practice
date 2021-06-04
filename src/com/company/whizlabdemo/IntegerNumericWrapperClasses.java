package com.company.whizlabdemo;

/**
 *  - four integral numeric wrapper classes are:
 *      1. Byte
 *      2. Short
 *      3. Integer
 *      4. Long
 *          - they have fields and methods with similar names and functionalities
 */
public class IntegerNumericWrapperClasses {
    public static void main(String[] args) {
        int sum = Integer.sum(1, 3);
        int maxNo = Integer.max(3,8);
        long l = Long.compare(244562, 7243417);
        short s = Short.reverseBytes((short) 10);
        byte b = Byte.valueOf((byte) 3);
        System.out.println(sum);
        System.out.println(maxNo);
        System.out.println(l);
        System.out.println(s);
        System.out.println(b);

    }
}
