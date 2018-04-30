package edu.handong.csee.lab13.prob5;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		int row1,column1;
		int row2,column2;
		int [][] list1;
		int [][] list2;
		
		Scanner mys = new Scanner(System.in);
		
		System.out.print("Enter row size(Maximum 5): ");
		row1 = mys.nextInt();
		System.out.print("Enter column size(Maximum 5): ");
		column1 = mys.nextInt();
		
		System.out.print("Enter row size(Maximum 5): ");
		row2 = mys.nextInt();
		System.out.print("Enter column size(Maximum 5): ");
		column2 = mys.nextInt();
		
		list1 = new int [row1][column1];
		list2 = new int [row2][column2];
		
		System.out.print("Enter List1: ");
		for(int i=0 ; i<row1 ; i++) {
			for(int j=0 ; j<column1 ; j++) {
				list1[i][j] = mys.nextInt();
			}
		}
		
		System.out.print("Enter List2: ");
		for(int i=0 ; i<row2 ; i++) {
			for(int j=0 ; j<column2 ; j++) {
				list2[i][j] = mys.nextInt();
			}
		}
			
		for(int i=0 ; i<row1 ; i++) {
			for(int j=0 ; j<column1 ; j++) {
				System.out.print(list1[i][j] );
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0 ; i<row2 ; i++) {
			for(int j=0 ; j<column2 ; j++) {
				System.out.print(list2[i][j] );
			}
			System.out.println();
		}
		System.out.println();
		
		//Equals e= new Equals();
		
		if(Equals.equals(list1,list2))
			System.out.println("The two arrays are approximately identical");
		else 
			System.out.println("The two arrays are not identical");
		
		
	}

}
