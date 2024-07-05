package com.factory.example;

public class MainClass {

	public static void main(String[] args) {
        A a = AppFactory.createA();
        a.doSomething();
    }
	
}
