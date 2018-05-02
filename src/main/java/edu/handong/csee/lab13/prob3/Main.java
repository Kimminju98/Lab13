package edu.handong.csee.lab13.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		double n1,n2; 
		Scanner myscanner = new Scanner(System.in); // instantiate Scanner class
		
		System.out.print("Enter radius: "); // print out
		n1 = myscanner.nextDouble(); // put user's input to n1
		Circle cir = new Circle(n1); // instantiate Circle class with parameter, n1
		System.out.println("Radius: "+cir.getRadius()); // call getRadius method of Cicle class that show radius of Cicle
		cir.display(); // call display method of Shape class that inherited by Circle class
		
		System.out.print("Enter length and width: "); // print out
		n1 = myscanner.nextDouble(); // put user's input to n1 
		n2 = myscanner.nextDouble(); // put user's input to n2
		Rectangle rec = new Rectangle(n1,n2); // instantiate Rectangle class with parameters, n1 and n2(legnth and width)
		System.out.println("Length: "+rec.getLength()); // call getLength method of Rectangle class that show legnth of Rectangle
		System.out.println("Width: "+rec.getWidth()); // call getwidth method of Rectangle class that show width of Rectangle 
		rec.display(); // call display method of Shape class that inherited by Circle class
		
	}
}
