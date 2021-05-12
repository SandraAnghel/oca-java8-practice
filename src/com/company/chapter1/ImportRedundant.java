// import com.company.chapter1.wildcards.ImportPdf;

/* package = keyword = specifies the location of the class
          = used by java for logical grouping of classes
          = it must be first line in the class(before imports or class definition)
 */
package com.company.chapter1;

import com.company.chapter1.wildcards.ImportPdf;
import com.company.chapter1.wildcards.ImportExcel;
import com.company.chapter1.wildcards.*;  // redundant because of explicit import

import java.lang.*; // redundant - java.lang is automatically imported
import java.lang.System; // redundant - java.lang is automatically imported

/**
 * public = keyword and access modifier = class is visible on public level
 * class = keyword used to define a class
 * ImportRedundant = name of class
 */
public class ImportRedundant {
    /**
     * public = keyword and access modifier = method is visible on public level
     * static = keyword = no need of instance of the class = method can be called using the name of the class
     * void = keyword and return type = method doesn't return anything
     * @param args = list of string parameters
     */
    public static void main(String[] args) {
        ImportPdf importPdf = new ImportPdf();
        ImportExcel importExcel = new ImportExcel();
    }
}
