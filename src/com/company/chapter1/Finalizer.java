package com.company.chapter1;

public class Finalizer {

    public static void main(String[] args) {
        Finalizer f = new Finalizer();
    }

    protected void finalize(){
        System.out.println("Calling finalize");
    }
}
