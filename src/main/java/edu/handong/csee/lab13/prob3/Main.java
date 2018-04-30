package edu.handong.csee.lab13.prob3;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		double n1,n2;
		Scanner myscanner = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		n1 = myscanner.nextDouble();
		Circle cir = new Circle(n1);
		System.out.println("Radius: "+cir.getRadius());
		cir.display();
		
		System.out.print("Enter length and width: ");
		n1 = myscanner.nextDouble();
		n2 = myscanner.nextDouble();
		Rectangle rec = new Rectangle(n1,n2);
		System.out.println("Length: "+rec.getLength());
		System.out.println("Width: "+rec.getWidth());
		rec.display();
		
	}
}
