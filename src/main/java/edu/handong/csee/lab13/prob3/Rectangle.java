package edu.handong.csee.lab13.prob3;

public class Rectangle extends Shape{ // Rectangle inherits Shape
	
	private double length; // length
	private double width; // width
	
	public Rectangle(double length, double width) { // constructor of Rectangle class and the parameters are length and width
		this.length = length; // length of Rectangle class is length of parameter
		this.width = width; // width of Rectangle class is width of parameter
	}
	
	public double area() { // Shape class's area method
		return length * width; // return area
	}
	
	public double perimeter() { // Shape class's perimeter method
		return 2*(length + width); // return perimeter
	}

	public double getLength() { // used to get the Rectangle's length
		return length; // return length
	}
	
	public double getWidth() { // used to get the Rectangle's width
		return width; // return width
	}

	

}
