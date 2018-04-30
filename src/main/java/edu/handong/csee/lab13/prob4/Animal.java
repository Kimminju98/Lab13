package edu.handong.csee.lab13.prob4;

public class Animal { // highest class
	
	private String name; // name
	
	public Animal(String name) { // constructor of Animal class and the parameter is name
		this.name=name; // name of Animal class is name of parameter
	}
	
	public void display() {
		System.out.println("Name: "+ name); // print out name 
	}
}
