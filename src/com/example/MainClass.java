package com.example;

public class MainClass extends MyAbstractClass1 implements MyInterface2,MyFunctionalInterfaceEx  {

	public static void main(String args[]) {
		
		MyInterface2 interface2 = new MainClass();
		
		System.out.println("Variable from MyInterface1 : "+MyInterface1.i);
		
		System.out.println("Variable from MyInterface2 : "+MyInterface2.j);
		
		interface2.display1Interface2();
		
		interface2.display2Interface2();
		
			
		MyFunctionalInterfaceEx.displayFI3();
		
		MyFunctionalInterfaceEx obj = new MainClass();
		
		obj.displayFI1();
		obj.displayFI2();
		
	}

	@Override
	public void display1Interface1() {
		System.out.println("MyInterface1 method1");		
	}

	@Override
	public void display2Interface1() {
		System.out.println("MyInterface1 method2");		
		
	}

	@Override
	public void display1Interface2() {
		System.out.println("MyInterface2 method1");		
		
	}

	@Override
	public void display2Interface2() {
		System.out.println("MyInterface2 method2");		
		
	}

	@Override
	public void display1ABC1() {
		System.out.println("MyAbstractClass method1");		
		
	}

	@Override
	public void displayFI1() {
		System.out.println("MyFuntionalInterface method1");	
		
	}

	
}
