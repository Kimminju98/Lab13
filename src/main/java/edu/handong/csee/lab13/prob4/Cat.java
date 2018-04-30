package edu.handong.csee.lab13.prob4;

public class Cat extends Animal implements Pet{

	private String cname;
	public Cat(String cname) {
		super(cname);
		this.cname = cname;
	}
	
	public String food() {
		return "(Cat!)Fish";
	}
	
	
}
