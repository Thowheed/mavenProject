package com.m1;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Inisde laptop consturctor");
    }

    @Override
    public void compile() {
        System.out.println("inside laptop compile");
    }
}
