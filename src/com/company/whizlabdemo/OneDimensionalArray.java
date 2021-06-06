package com.company.whizlabdemo;

/**
 *      Declaration
 *  - an array declaration has two components: the array's type and the array's name
 *  - e.g:
 *          int[] intArray;
 *          String[] stringArray;
 *          MyObject[] objectArray;
 *       Instantiation
 *  - an array can be instantiated with the new operator, followed by the type of elements and the array length enclosed within square brackets
 *  - e.g:
 *          intArray = new int[5];
 *       Initialization
 *  - array elements are implicitly initialized with default values when the array is created
 *  - you may explicitly do this by assigning values to these elements
 */
public class OneDimensionalArray {

    public static void main(String[] args) {

        // array initialization using a loop construct
        int[] intArray = new int[5];
        for(int i = 0; i < 5; i++) {
            intArray[i] = i;
            System.out.println(intArray[i]);
        }

        // array initialization using array initializer
        int[] intArray1 ={1, 2, 3, 4, 5};
        int[] intArray2 = new int[]{1, 2, 3, 4, 5};

        String[] stringArray = new String[2];
        System.out.println(stringArray[1]); // it prints the default value of a string array -> null

        int[] numbers = new int[2];
        numbers[1] = 1;
        numbers[2] = 2;
        System.out.println(numbers[1] + numbers[2]); // throws an exception at runtime


}
}
