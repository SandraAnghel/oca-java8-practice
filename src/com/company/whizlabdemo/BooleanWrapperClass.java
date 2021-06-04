package com.company.whizlabdemo;

/**
 *  - the Boolean class wraps a value of the primitive type boolean in an object
 */
public class BooleanWrapperClass {

    public static void main(String[] args) {
    Boolean bool = Boolean.logicalAnd(false, true);
    System.out.println(bool);
    int compare = bool.compareTo(false);
    System.out.println(compare);

    Boolean bool1 = Boolean.logicalAnd(Boolean.logicalOr(true, false),true);
    System.out.println(bool1);

    boolean defined = Character.isDefined('@');
    System.out.println(defined) ;
    }
}
