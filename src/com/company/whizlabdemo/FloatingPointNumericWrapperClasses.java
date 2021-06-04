package com.company.whizlabdemo;

/**
 *  - two floating-point numeric wrapper classes are:
 *          1. Float
 *          2. Double
 *              - they have fields and methods with similar names and functionalities
 */
public class FloatingPointNumericWrapperClasses {
    public static void main(String[] args) {
        double max = Double.max(1.1, 2.2);
        String f = Float.toHexString(1.0f);
        System.out.println(max);
        System.out.println(f);

        Double wrapper = new Double(1.5);
        long primitive = wrapper.intValue();
        System.out.println(primitive);


    }
}
