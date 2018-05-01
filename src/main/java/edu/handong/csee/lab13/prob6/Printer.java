package edu.handong.csee.lab13.prob6;

public class Printer {

	public static void print(Pointer object) { // the parameter is reference of Pointer class
		String str = object.display(); // put result of display method to str
		if(object instanceof CapitalPrint) // if the object is instance of CapitalPrint class
			str = str.toUpperCase(); // str change the UpperCase
		System.out.println(str); // print out str
		
	}
	
}
