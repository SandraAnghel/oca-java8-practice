package com.company.whizlabdemo;


/**
 *  The while statement continually executes a block of statements while a particular condition evaluates to true
 */
public class WhileLoop {

    public static void main(String[] args) {
        int i = 0;
        while(i < 10) {
            i++;
            System.out.println(i); // it prints integers from 1 to 10
        }

        int y = 0;
        while(y < 10) {
            System.out.println(y);  // it prints integers from 0 to 9
            y++;
        }

        int z = 0;
        while(z < 10)
            z++;
        System.out.println(z);  // it prints number 10 only
    }
}
