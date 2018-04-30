package edu.handong.csee.lab13.prob4;

public class Dog extends Animal implements Pet{
	
	public Dog(String dname) {
		super(dname);
	}
	
	public String food() {
		return "(Dog!)Sausage";
	}
	

}
