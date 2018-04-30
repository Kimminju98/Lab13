package edu.handong.csee.lab13.prob6;

public class Printer {

	public static void print(Pointer object) {
		String str = object.display();
		if(object instanceof CapitalPrint)
			str = str.toUpperCase();
		System.out.println(str);
		
	}
	
}
