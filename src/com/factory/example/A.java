package com.factory.example;

public class A {

	private B b;
	
	public A(B b) {
		this.b=b;
	}
	
	public void doSomething() {
		System.out.println("Class A is doing something !!!");
		b.doSomething();
	}
	
}
