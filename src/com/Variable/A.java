package com.Variable;

public class A {

	static int m=100;//static variable
	
	 void method() {
		 int n=90;//local variable
	 }
	 
	 public static void main(String[] args) {
		int data = 50;//instance variable,Gloabal variable
		
		A a = new A();
		a.method();
	}
	
}
