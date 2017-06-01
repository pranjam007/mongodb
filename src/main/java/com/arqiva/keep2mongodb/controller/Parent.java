package com.arqiva.keep2mongodb.controller;

/**
 * Created by pranjal.mathur on 21/09/2016.
 */
public class Parent {

    int count;

    Parent(Integer count) {
        this.count = count;
    }

    static void doStuff() {
        System.out.println("In Parent");
    }

}

class Child extends Parent {

    Child() {

    }

    void doStuff() {
        System.out.println("In Child");
    }

    public static void main(String[] args) {
        Child c = new Parent();
        Child c1 = new Child();
        Parent p = new Child();
    }

}