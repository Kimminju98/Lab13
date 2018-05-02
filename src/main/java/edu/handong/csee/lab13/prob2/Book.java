package edu.handong.csee.lab13.prob2;

public class Book { // highest class
	private static int idcount=0; // used to increase the id count and it is continue.
	private String name; // book's name
	private int id; // the id about each of book
	
	public Book(String name) { // book's constructor, the parameter is String name
		this.name=name; // Book class's name is parameter name
		idcount++; // id count + 1
		this.id=idcount; // put id count to Book's id  
	}
	public void show() {
		System.out.println("<<BOOK>>"); // print out
		this.info(); // call the book's method, info
		
	}
	public void info() {
		System.out.println("Id: "+id); // print out the id 
		System.out.println("Book name: "+name); // print out the book name	
	}
	
	
}
