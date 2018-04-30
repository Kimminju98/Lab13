package edu.handong.csee.lab13.prob2;

public class Book { // highest class
	private static int idcount=0; // used to increase the id count
	private String name; // 
	private int id;
	
	public Book(String name) {
		this.name=name;
		idcount++;
		this.id=idcount;
	}
	public void show() {
		System.out.println("<<BOOK>>");
		this.info();
		
	}
	public void info() {
		System.out.println("Id: "+id);
		System.out.println("Book name: "+name);
	
	}
	
	
}
