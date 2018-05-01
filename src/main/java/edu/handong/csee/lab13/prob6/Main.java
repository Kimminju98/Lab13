package edu.handong.csee.lab13.prob6;

public class Main {
	
	public static void main(String[]args) {
		UpPoint p1 = new UpPoint(3,3); // instantiate UpPoint class
		DownPoint p2 = new DownPoint(2,5); // instantiate DownPoint class
		DownPoint p3 = new DownPoint(4,7); // instantiate DownPoint class
		UpPoint p4 = new UpPoint(9,12); // instantiate UpPoint class
		Printer.print(p1); // call print method of Printer class
		Printer.print(p2); // call print method of Printer class
		Printer.print(p3); // call print method of Printer class
		Printer.print(p4); // call print method of Printer class
	}

}
