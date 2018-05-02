package edu.handong.csee.lab13.prob3;

public abstract class Shape { // abstract class, Shape

	public abstract double area(); // abstract method, area
	public abstract double perimeter(); // abstract method, perimeter
	
	public void display() {
		System.out.println("Area: "+area()); // call area method and print out area
		System.out.println("Perimeter: "+perimeter()); // call perimeter method and print out perimeter
	}
	
}
