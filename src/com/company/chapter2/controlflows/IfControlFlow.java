package com.company.chapter2.controlflows;

public class IfControlFlow {
    public static void main(String[] args) {
        /*
            if(boolean expression) {
                // code executed when boolean expression is true
            }
         */
        int morningGreetingCount = 0;
        int hoursOfDay = 1;
        if(hoursOfDay < 11) {
            System.out.println("Good morning!"); // statement
            // statement 2
            // ...
            // statement n
            morningGreetingCount++;
        }

        if(hoursOfDay < 11)
            System.out.println("Good Morning");
        morningGreetingCount++;

        /*
            if(boolean expression) {
                // code executed when boolean expression is true
            }else {
                // code executed when boolean expression is false
            }
         */

        hoursOfDay = 12;
        if(hoursOfDay < 11) {
            System.out.println("Good Morning");
        } else {
            System.out.println("Good Afternoon");
        }

        if(hoursOfDay < 11) {
            System.out.println("Good Morning");
        } else if(hoursOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        if(hoursOfDay < 15) {
            System.out.println("Good Morning");
        } else if(hoursOfDay < 11) {
            System.out.println("Good Afternoon"); // unreachable code
        } else {
            System.out.println("Good Evening");
        }

        // Ternary Operator - expression ? when expression is true : when expression is false
        String x = hoursOfDay < 11 ?  "Good Morning" : "Good Afternoon";
        int y = 10;
        int x1;
        if(y > 5) {
            x1 = 2 * y;
        } else {
            x1 = 3 * y;
        }
        x1 = y > 5 ?  2 * y : 3 * y ;

        // int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE
        /*if(y < 91) {
            int animal = 9;
        }else {
            int animal = "Horse";
        }*/

        int y1 = 1;
        int z = 1;
        int x2 = y1<10 ? y1++ : z++;
        System.out.println(x2 + "," + y1+","+z); // Outputs 2,1
    }
}
