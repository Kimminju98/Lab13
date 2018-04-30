package edu.handong.csee.lab13.prob2;

public class History extends Book { // history inherits Book 
	
	private String author; 

	public History(String name, String author) {
		super(name);
		this.author = author;
	}
	public void show() {
		System.out.println("<<History>>");
		this.info();
	}
	
	public void info() {
		super.info();
		System.out.println("Author: "+author);
	}

	
}
