package com.company.whizlabdemo;

/**
 *  Comparison of Strings using equals method
 *      - the equals method is overridden in the String class, comparing strings based on their contained literal values
 *      - string comparison in Java is case sensitive
 */
public class StringsComparison {
    private int value;
    public StringsComparison(int value) {
        this.value = value;
    }
    public static void main(String[] args) {
        String string1 = new String("Whizlabs");
        String string2 = new String("Whizlabs");
        String string3 = "Whizlabs";
        System.out.println(string1.equals(string2));
        System.out.println(string2.equals(string3));

        String s1 = new String("OCAJP 8");
        String s2 = new String(s1);
        System.out.println(s1 == s2);

        String m1 = new String("OCAJP 8");
        String m2 = new String("ocajp 8");
        System.out.println(m1.equals(m2));

        StringsComparison c1 = new StringsComparison(0);
        StringsComparison c2 = new StringsComparison(0);
        StringsComparison c3 = c2;
        c2 = c1;
        System.out.println(c1.equals(c3));
    }
}
