package com.example;

@FunctionalInterface
public interface MyFunctionalInterfaceEx {

	public void displayFI1();
	
	default void displayFI2() {
		System.out.println("I am in default Method of FunctionalInterface ");
	}
	
	static void displayFI3() {
		System.out.println("I am in static  Method of FunctionalInterface ");
	}
	
}
