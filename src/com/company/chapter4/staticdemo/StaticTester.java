package com.company.chapter4.staticdemo;

public class StaticTester {

    public static void main(String[] args) {
        StaticDemo s = new StaticDemo();
        s.instanceCounter = 1;
        System.out.println(StaticDemo.counter);
        StaticDemo.incrementCounter();
        System.out.println(StaticDemo.counter);
        StaticDemo s2 = new StaticDemo();
        s2.instanceCounter = 2;
        System.out.println(s.getCounter());
        System.out.println(s2.getCounter());

    }
}
