package com.factory.example;

public class C {

	private D d;
	
	public C(D d ) {
		this.d =d;
	}
	
	public void doSomething() {
		System.out.println("Class C is doing something !!!");
		d.doSomething();
	}
	
}
