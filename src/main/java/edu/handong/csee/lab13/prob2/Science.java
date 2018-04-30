package edu.handong.csee.lab13.prob2;

public class Science extends Book{

	private String publisher;
	
	public Science(String name, String publisher) {
		super(name);
		this.publisher = publisher;
	}
	public void show() {
		System.out.println("<<Science>>");
		this.info();
	}
	public void info() {
		super.info();
		System.out.println("Publisher: "+publisher);
	}
}
