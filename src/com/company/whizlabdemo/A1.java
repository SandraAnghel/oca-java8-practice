package com.company.whizlabdemo;

public class A1 implements I1, I2{
    static int x = 9;

    public static void main(String[] args) {
        int x = 8;
        for(;x > -1;){
            System.out.println(x);
            x--;
        }
    }

}

class A2 extends B1{}

class B1 extends A1{
    int age;
}

class c1{

}

interface I1{
    int age = 2;
}

interface I2{
    int age = 2;

    static void t() {
        int x = 8;
        for(;x>-1;x--)
            System.out.println(x);
    }
}

