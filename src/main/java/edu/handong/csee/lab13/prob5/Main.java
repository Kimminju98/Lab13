package edu.handong.csee.lab13.prob5;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		int row1,column1; // list1's row and column
		int row2,column2; // list2's row and column 
		int [][] list1; // int type array
		int [][] list2; // int type array
		
		Scanner mys = new Scanner(System.in); // instantiate Scanner class
		
		System.out.print("Enter row size(Maximum 5): "); // print out
		row1 = mys.nextInt(); // put user's input to row1
		System.out.print("Enter column size(Maximum 5): "); // print out
		column1 = mys.nextInt();// put user's input to column1
		
		System.out.print("Enter row size(Maximum 5): ");// print out
		row2 = mys.nextInt(); // put user's input to row2
		System.out.print("Enter column size(Maximum 5): ");// print out
		column2 = mys.nextInt(); // put user's input to column2
		
		list1 = new int [row1][column1]; // instantiate list1 array
		list2 = new int [row2][column2]; // instantiate list2 array
		
		System.out.print("Enter List1: "); // print out
		for(int i=0 ; i<row1 ; i++) { 
			for(int j=0 ; j<column1 ; j++) {
				list1[i][j] = mys.nextInt(); // put user's input to list1 array according to it's position of row and column
			}
		}
		
		System.out.print("Enter List2: "); // print out 
		for(int i=0 ; i<row2 ; i++) { 
			for(int j=0 ; j<column2 ; j++) {
				list2[i][j] = mys.nextInt(); // put user's input to list2 array according to it's position of row and column
			}
		}
			
		for(int i=0 ; i<row1 ; i++) {// print out list1 array according to it's number of row and column
			for(int j=0 ; j<column1 ; j++) {
				System.out.print(list1[i][j] );
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0 ; i<row2 ; i++) {// print out list2 array according to it's number of row and column
			for(int j=0 ; j<column2 ; j++) {
				System.out.print(list2[i][j] );
			}
			System.out.println();
		}
		System.out.println();
		
		
		if(Equals.equals(list1,list2)) // call equals method of Equals class and the parameters are arrays of list1 and list2
			// and if the return value of method is true
			System.out.println("The two arrays are approximately identical"); // print out
		else  // if the return value of method is false
			System.out.println("The two arrays are not identical"); //print out
		
		
	}

}
