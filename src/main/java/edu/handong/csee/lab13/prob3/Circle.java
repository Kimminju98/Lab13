package edu.handong.csee.lab13.prob3;

public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public double area(){
		
		return Math.PI * Math.pow(radius,2);
	}
	public double perimeter() {
		return 2.0 * Math.PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}
}
