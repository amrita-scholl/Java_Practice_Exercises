package com.springexample;

public class MainApp {

	 public static void main(String[] args) {
	        // Create instances in reverse order of dependencies
	        D d = new D();
	        C c = new C(d);
	        B b = new B(c);
	        A a = new A(b);

	        // Use the class A which triggers the chain of calls
	        a.doSomething();
	    }
	 
}
