package edu.handong.csee.lab13.prob4;

public class Cat extends Animal implements Pet{ // Cat inherits Animal and implements Pet

	private String cname;
	public Cat(String cname) { // constructor of Cat class and the parameter is cname
		super(cname); // call constructor of Animal class
		this.cname = cname; // cname of Cat class is cname of paramter
	}
	
	public String food() { // food method of Pet 
		return "(Cat!)Fish"; //return food's name
	}
	
	
}
