package com.example.demo;

public class B extends A{ //inheritance (IS-A Relations)
	//how you can from Relation between two class
	// using  extends key word
	public void m2() {
		System.out.println("Hello Benarji");
		
	}
	
	public static void main(String[] args) {
		//how you can create object of class B
		// new key word
		//className refrenceObjectName= new Class; 
		B t= new B();
		t.m2();
		//How B class M1(() method presnt A class
		t.m1();
		}

}
