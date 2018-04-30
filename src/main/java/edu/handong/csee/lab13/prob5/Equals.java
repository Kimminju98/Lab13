package edu.handong.csee.lab13.prob5;

public class Equals {

	public static boolean equals(int[][] list1, int[][] list2) {
		
		if(list1.length!=list2.length) return false; 
		
		int count=0;
		int col=list1[0].length;
		
		if(list1[0].length>list2[0].length) col=list2[0].length;
		
		for(int i=0; i<list1.length ;i++) {
			for(int j=0 ; j<col ; j++) {
				if(list1[i][j]!=list2[i][j]) count++;
			}
		}
		if(count>3) return false;
		return true;
	}
}
