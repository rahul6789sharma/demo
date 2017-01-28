package com.learn.test;

// singleton class
public class A {

	private static A a = new A();

	private A() {
		System.out.println("Private Constroctor");
	}

	public static A getInstance() {
		System.out.println("Factory Method");
		return a;
	}
	
	public void dis(){
		System.out.println("Hello By A");
	}
}


