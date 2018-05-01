package edu.handong.csee.lab13.prob6;

public class Pointer { // hightest class
private int x,y;
	
	public Pointer(int x,int y) { // constructor of Pointer class and the paramters are x and y
		this.x=x; // x of class is x of parameter
		this.y=y; // y of class is y of parameter
	}
	public String display() {
		return "x: "+x+" y: "+y; // return x: value and y: value
	}
}
