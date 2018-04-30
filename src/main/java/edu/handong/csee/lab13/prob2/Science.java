package edu.handong.csee.lab13.prob2;

public class Science extends Book{ // Science inherits Book

	private String publisher; // publisher
	
	public Science(String name, String publisher) { // constructor of Science class and the parameters are name and pulisher
		super(name); // call the constructor of book class
		this.publisher = publisher; // publisher of Science class is publisher of parameter
	}
	public void show() {
		System.out.println("<<Science>>"); // print out
		this.info(); // call info method of Science class
	}
	public void info() {
		super.info(); // call info method of Book class that print out name and id
		System.out.println("Publisher: "+publisher); // print out publisher
	}
}
