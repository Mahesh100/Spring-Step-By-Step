package com.springcore.ci;

public class Addition {

	private int a;
	private int b;
	
	
	//Overloading
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Second constructor get called");
	}
	
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("First constructor get called");
	}
	


	
	public void doSum() {
		System.out.println("Sum is: "+ (this.a+ this.b));
	}

//	@Override
//	public String toString() {
//		return "Addition [a=" + a + ", b=" + b + "]";
//	}
	
	
	
	
}
