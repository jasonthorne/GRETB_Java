package com.android;

public class Examples {
	
	
	public static void twoD() {
		int[]nums1 = {45,89,100};
		int[]nums2 = new int[4];
		
		for(int num: nums2) {
			System.out.println(num); //4 zeros
		}
		
		
		//------------
		
		int[][]twoD1 = new int[2][3]; //x2 1 dim arrays of length 3 (or 2 rows 3 cols).
		
		int[][]twoD2 = {
					{56, 77, 99}, //1st row of length 3
					{100, 345, 88} //2nd row of length 3
		};
		
		//print array values:
		System.out.println(twoD2[0][0]);
		System.out.println(twoD2[1][2]);
		
		
		int[][]twoD3 = {{56, 77, 99},{100, 345, 88}};
		
		//print array values:
		System.out.println(twoD2.length); //amount of rows (how many arrays in this array)
		System.out.println(twoD2[0].length); //amount of columns in the first row (how many elements in the first array within this array)
		
		int[]numbers = twoD3[0]; //assigning the value of the array at pos 0 in twoD3
		
		
		//looping through rows in multi dim array:
		for (int i=0;i<twoD3.length; i++){
			
			//loop through cols in multi dim array
			for (int j=0;j<twoD3[i].length; j++){
				System.out.print(twoD3[i][j] + ",");
			}
			
		}
		
		
	}
	
	
	//-----------------------------
	
	
	static void threeD() {
		
		//36 number in this. 4x3x3
		int threeD1[][][] = new int[4][3][3]; //3 dim array - DEPTH, ROW, COL
		
		
		int twoD[][]= {{45,66,88},{100,102,103}};
		
		int threeD2[][][] = {twoD, twoD, twoD};
		
		int array1[] = {88,99,10001};
		
		int threeD3[][][] = {
				twoD,
				{array1, array1, array1}, //an array of arrays (ie a 2 dim array) ++++++
				{{999,998,997},{996,995,994}} //another array of arrays
		};
		
		
		//--------
		
		//looping through rows in multi dim array:
		for (int i=0;i<threeD3.length; i++){
			
			//loop through cols in multi dim array
			for (int j=0;j<threeD3[i].length; j++){
				
				for (int k=0;k<threeD3[i][j].length; k++){
					
					System.out.print(threeD3[i][j][k] + ",");
				}
				
				System.out.println("");
			}
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}