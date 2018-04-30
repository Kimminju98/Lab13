package edu.handong.csee.lab13.prob4;

public class Dog extends Animal implements Pet{ // Dog inherits Animal and implements Pet
	
	public Dog(String dname) { // constructor of Dog and the parameter is dname
		super(dname); // call constructor of Animal class 
	}
	
	public String food() { // food method of Pet 
		return "(Dog!)Sausage"; //return food's name
	}
	

}
