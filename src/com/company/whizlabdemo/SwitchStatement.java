package com.company.whizlabdemo;

/**
 *  - the switch statement is a control flow statement that can have several possible execution paths
 *  - a switch works with the byte, short, char, int primitive data types and their wrapper classes, enum types and String
 *  - a statement in the body of a switch can be labeled with one or more case or default labels;
 *  - the switch statement evaluates its expression, then executes all statements than follow the matching case label
 *  - default label is not necessarily the last one in the label lists
 *  - there is only one default label per switch statement
 *  - a case label can contain more statements to be executed
 */
public class SwitchStatement {
    enum Gender{FEMALE, MALE, UNISEX}
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE ;
        switch(gender) {
            case FEMALE:
                System.out.println("Female");
                System.out.println("Female");
                    break;
            case MALE:
                System.out.println("Male");
                    break;
            default:
                System.out.println("Unisex");

        }
    }
}
