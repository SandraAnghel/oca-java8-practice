/*
 package = keyword = specifies the location of the class
         = used by java for logical grouping of classes
 */
package com.company.chapter1;
// import = specifies to the compiler where to find Random class
import java.util.Random;

// import com.company.chapter1.wildcards.ImportExcel;
// import com.company.chapter1.wildcards.ImportPdf;
import com.company.chapter1.wildcards.*;

import com.company.chapter1.*;



/**
 * class = keyword used to define a class
 * public = keyword and access modifier = class is visible on public level
 * ImportExample = name of the class
 */
public class ImportExample {
    /**
     * public = keyword and access modifier = method is visible on public level
     * static = keyword = no need of instance of the class = method can be called using the name of the class
     * void = keyword and return type = method doesn't return anything
     * @param args = list of string parameters
     */
    public static void main(String[] args) {
    Random r = new Random();
    ImportExcel importExcel = new ImportExcel();
    ImportPdf importPdf = new ImportPdf();
    }
}
