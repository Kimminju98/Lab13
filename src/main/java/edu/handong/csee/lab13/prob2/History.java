package edu.handong.csee.lab13.prob2;

public class History extends Book { // history inherits Book 
	
	private String author; // author 

	public History(String name, String author) { // constructor of history class and the parameters are name and author
		super(name); // call book's constructor and give the name
		this.author = author; // history's author is parameter's author
	}
	public void show() {
		System.out.println("<<History>>"); // print out
		this.info(); // call method info of history class
	}
	
	public void info() {
		super.info(); // call method of book's info that print out name and id 
		System.out.println("Author: "+author); // print out author
	}

	
}
