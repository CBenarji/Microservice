package com.example.demo;

public class C extends B{
	//i want to m1 method and m2 method in class c
	public void m3() {
		System.out.println("Hello Java");
		
	}
		public static void main(String[] args) {
		C t= new C();
		t.m2();
		t.m1();
		t.m3();
		}

}
