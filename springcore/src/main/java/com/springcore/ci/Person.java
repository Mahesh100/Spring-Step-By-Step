package com.springcore.ci;

public class Person {
	
	private String name;
	private int personId;
	//private Certificate certi;
	
	public Person(String name, int personId) {
		this.name=name;
		this.personId=personId;
		//this.certi=certi;
	}

	@Override
	public String toString() {
		
		return this.name+":"+this.personId;
	}
	
	

}
