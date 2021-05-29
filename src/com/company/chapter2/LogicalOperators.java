package com.company.chapter2;

import java.io.File;

public class LogicalOperators {
    public static void main(String[] args) {
        /*
            AND (&) - true only when both operands true
                && - short circuit - when first is false second is not executed
            inclusive  OR (|)  - false only when both operands are false
                || - short circuit - when first is true second is not executed
            exclusive OR (^)   - true only when operands are different
         */

        int x = 10, y = 20, z = 10;

        boolean i1 = true || (y < 4); // true
         System.out.println(5 == 5.0); // true because left side is automatically promoted to double

        // boolean x1 = true == 3; - DOES NOT COMPILE
        // boolean y1 = false != "Giraffe"; - DOES NOT COMPILE
        // boolean z1 = 3 == "Kangaroo"; - DOES NOT COMPILE

        boolean y2 = false;
        boolean x2 = (y2 = true);
        System.out.println(x2); // Outputs true

        File x3 = new File("myFile.txt");
        File y3 = new File("myFile.txt");
        File z3 = x3;
        System.out.println(x3 == y3); // Outputs false
        System.out.println(x3 == z3); // Outputs true
        File x4 = null;
        File y4 = null;
        System.out.println(x4 == y4);
    }

}
