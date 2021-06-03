package com.company.whizlabdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *  - without the import statement, types from other packages must be referred to by their fully qualified names
 *      - e.g:
 *          - java.util.List
 *          - java.util.Map
 *  - using import statements allows a source file to refer to types from other packages by their simple names
 *      - e.g:
 *          - import java.util.List;
 *          - import java.util.Map;
 *  - import statements must be put at the begining of a file, just after the package statement, if any
 *  - all types from a package may be imported with a single statement by using the (*) wildcard character
 *      - e.g:
 *          - import java.util.*;
 *  - the java.lang package is automatically imported
 */


public class ImportStatement {

    public static void main(String[] args) {
        // java.util.List<Integer> list = new java.util.ArrayList<>();   - using fully qualified name

        List<Integer> list = new ArrayList<>();  // using import statements after the package declaration
    }

}
