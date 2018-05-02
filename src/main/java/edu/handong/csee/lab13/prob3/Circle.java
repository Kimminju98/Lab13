package edu.handong.csee.lab13.prob3;

public class Circle extends Shape{ //Circle inherits Shape
	private double radius; // radius
	
	public Circle(double radius) { // constructor of Circle class and the parameter is radius
		this.radius = radius; // radius of Circle class is radius of parameter
	}
	public double area(){ //area method of Shape class
		
		return Math.PI * Math.pow(radius,2); // return 3.14 * radius * radius
	}
	public double perimeter() { // perimeter method of Shape class
		return 2.0 * Math.PI * radius;
	}
	
	public double getRadius() { // used to get radius of Circle class
		return radius; // return radius
	}
}
