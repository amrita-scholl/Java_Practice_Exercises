package com.springexample;

public class B {

    private C c;

    public B(C c) {
        this.c = c;
    }

    public void doSomething() {
        System.out.println("Class B is doing something");
        c.doSomething();
    }
}
