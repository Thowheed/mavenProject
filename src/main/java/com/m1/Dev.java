package com.m1;

public class Dev {
    private Computer com;
    private Laptop lap;

    private int age;

    public Dev(int age) {
        this.age = age;
        System.out.println("dev 1 const");
    }

    public Dev(Laptop lap) {
        this.lap = lap;
        System.out.println("dev 2 constructor");
    }

    public Dev() {
        System.out.println("Inisde Dev project..");
    }

    public void build() {
        System.out.println("Working on awesome project");
        // lap.compile();
        com.compile();

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // so we are having getters and setters for laptop and we the issue will be
    // solved
    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

}
