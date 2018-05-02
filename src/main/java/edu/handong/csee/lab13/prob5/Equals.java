package edu.handong.csee.lab13.prob5;

public class Equals {

	public static boolean equals(int[][] list1, int[][] list2) { // static method, the parameters are int type array
		
		if(list1.length!=list2.length) return false; // if row of list1 and row of list2 are different, return false.
		
		int count=0; // that is used to count number of different value between list1 and list2
		int col=list1[0].length; // this is coloum of list1
		
		if(list1[0].length>list2[0].length) col=list2[0].length; // put smallest number of column to col
		
		for(int i=0; i<list1.length ;i++) { // repeat until i < list1's row
			for(int j=0 ; j<col ; j++) { // repeat until j< col
				if(list1[i][j]!=list2[i][j]) count++; // if the value is different, increase count
			}
		}
		if(count>3) return false; // the different number is bigger than 3 return false
		return true; // all if statement are not satisfied return true.
	}
}
