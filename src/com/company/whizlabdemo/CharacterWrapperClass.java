package com.company.whizlabdemo;

/**
 *  - the Character wraps a value of the primitive type char in an object
 */
public class CharacterWrapperClass {

    public static void main(String[] args) {
        int codePoint = Character.codePointAt("OCAJP 8", 2);
        System.out.println(codePoint);
    }
}
