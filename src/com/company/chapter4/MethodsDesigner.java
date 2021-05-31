package com.company.chapter4;

public class MethodsDesigner {
    /**
     * void = return type
     * nap = name of the method
     */
    void nap() {

    }

    /**
     * int = return type
     * nap1 = name of the method
     * @return
     */
    int nap1(){
        return 0;
    }

    /**
     * void = return type
     * nap2 = name of the method
     * @param minutes = parameter of int type(integer parameter)
     */
    void nap2(int minutes) {

    }

    /**
     * void = return type
     * nap3 = name of the method
     * private = access modifier
     * @param min = integer parameter
     */
    private void nap3(int min) {
        //  Method can be used only inside MethodsDesigner class
    }

    /**
     * void = return type
     * nap4 = name of the method
     * public = access modifier
     * @param min = integer parameter
     */
    public void nap4(int min) {
        // Method can be used in any class of the project
    }

    /**
     * void = return type
     * nap5 = name of the method
     * protected = access modifier
     * @param min = integer parameter
     */
    protected void nap5(int min) {
        // Method can be used in: same package or subclasses
    }

    /**
     * void = return type
     * nap6 = name of the method
     * method has default access modifier (package private)
     * @param min = integer parameter
     */
    void nap6(int min) {
        // method can be used only in the same package
    }

    public static void nap7() {

    }

    static private void nap8() {

    }

    /**
     * Method name rules
     *  - letters
     *  - numbers
     *  - $
     *  - _
     *  - can't start with number
     */

    void nap9_(){}
    void _nap9() {}
    void $nap9() {}
    void nap9$() {}
    void $$() {}
    void $() {}
    // void 9nap() {}  does not compile


}
