package com.company.whizlabdemo;


/**
 *          Declaration
 *  - a multi-dimensional array declaration has two components: the array's type, with multiple pairs of brackets, and the array's name
 *  -e.g:
 *          int[][] intArray;
 *          String[][][] stringArray;
 *          MyObject[][][][] objectArray;
 *          Instantiation
 *  - a multi-dimensional array can be instantiated with the new operator, followed by the type of elements and two or more pairs of square brackets
 *          Initialization
 *  - you may initialize a multi-dimensional array by assigning values to its elements at all levels
 */
public class MultiDimensionalArray {

    public static void main(String[] args) {

        // Initialization using a loop construct
        int[][] intArray = new int[2][3];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++) {
                intArray[i][j] = i + j;
            }
        }

        // a multi-dimensional array can be instantiated and initialized using array initializer
        int[][] numbers = {{1, 2, 3}, {4, 5}};
        int[][] numbers1 = new int[][] {{1, 2, 3}, {4, 5}};

        
    }
}
