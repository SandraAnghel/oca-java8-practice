package com.company.whizlabdemo;

public class PrimitiveDataTypeCasting {

    /**
     *  Widening casting: implicitly implemented
     *      - byte -> short -> int -> long -> float -> double
     *  Narrowing casting: explicitly implemented(this type of casting requires a casting operator)
     *      - double -> float -> long -> int -> short -> byte
     */

    /*
        - Casting to and from char
            - widening casting from char to int, long, float or double
            - narrowing casting from char to byte or short; from short, int, long, float or double to char
            - widening and narrowing casting: byte to char
        - the magnitude and precision of a value may be lost after being cast
        - primitive type casting never results in a runtime exception
     */

    public void myMethod() {
        int myInt = 0;

        // widening casting
        long myLong = myInt;

        // narrowing casting
        byte myByte = (byte) myInt;
    }

    static int classVar;
    static String classVar2;


    public static void main(String[] args) {
        int localVar1;
        int localVar = 0;
         long newVar = localVar;  // implicit casting(widening)
        long firstVar = 0;
        int secondVar = (int)firstVar;  // explicit casting(narrowing)
        System.out.println(classVar);   // compiler will set the default value if it is not explicitly initialized
        // System.out.println(localVar1);  -  does not compile - local variables must be explicitly initialized before using

        classVar2 = "OCAJP8";
        String localVar2 = classVar2 + " " + "Preparation";
        System.out.println(localVar2);
    }
}
