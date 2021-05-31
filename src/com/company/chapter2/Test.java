package com.company.chapter2;

 class Test {
    static int t = 5;
    Test(){
        t++;
    }
    public static void main(String[] args) {
        int x = 0;
        int y = 10;
        try {
            int z = y / x;
        }
       // System.out.println("");
        catch(Exception e) {

        }
        int a[] = {1,025,3};
        System.out.println(a instanceof Object);
        System.out.println(053 == 43);
        int _4_;
        int $t;

        new Test().print();
        System.out.println(t);

        String s = "Java";
        s.concat("SE 6");
        s.replace('6', '7');
        s.toLowerCase();
        System.out.println(s);
    }
    public void print() {}
}

class Test2 {

}
/*interface A extends B,C{

}
interface B {

}
interface C {

}*/