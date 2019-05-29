package com.android;

public class Examples {
	
	static void ex1() {
		
		//ways of declaring arrays:
		int[] myArray1 = new int[4]; //must give size of array in constructor call
		int myArray2[] = new int[5];
		
		/*arrays are given default values.
		ints: the number will be 0.
		floating point numbers: 0.0
		boolean: false
		char: ''
		objects; null
		*/
	
		//assigning values to (an already created) array:
		myArray1[0] = 56;
		myArray1[2] = 1000;
		
		//once the size of the array is set, it can't be changed. arrayOutOfBounds given if you try to add or read more:
		//myArray1[4] = 77; //only 4 positions in array, so we cant assign anything to the 5th pos.
		//System.out.println(myArray1[4]); //only 4 positions in array, so we cant acess anything to the 5th pos.
		
		//print an array element:
		System.out.println(myArray1[2]);
		
		//========
		
		//this array is given a length of 2:
		double dArray1[] = new double[] {45.67, 89.77};
		
		//this array is given a length of 3:
		double[] dArray2 = {45.67, 89.77, 7.99};
		
		//print array lengths:
		System.out.println(dArray1.length); //length 2
		System.out.println(dArray2.length); //length 3
		
		System.out.println(dArray1[dArray1.length-1]); //find last element of array (needs to be -1 as length is 0 indexed)
		
		
		//=========
		//An array is an object, so we can assign one array to another
		
		double[]copyArray = dArray1;
		System.out.println(dArray1 == copyArray); //same objects with same values
		
		dArray1[0]=4; //assigning an int to a double array element
		//dArray1 = myArray1; cant assign an int array to a double array.
		//myArray1 = dArray1; cant assign a double array to an int array.
		
		//===================================================================================looping through arrays:
		
		//enhanced for:
		for(double dNum: dArray2) {
			System.out.println("enhanced for: "+dNum);
		}
		
		String[] names = {"noel", "patsy", "nora"};
		
		for(String name: names) {
			System.out.println("name is: "+name);
		}
		
		
		dArray1 = new double[] {3.4,5.6,7.8};
		
		for(double d: dArray2) {
			System.out.println(d);
			d=4.56; //this doesn't effect the array, just the value of 'd'
		}
		
		
		//populate an array with 7 numbers:
		int[]numArray=new int[7];
		for(int i=0;i<numArray.length;i++) {
			numArray[i] = i+2;
		}
		
		for(int num:numArray) {
			System.out.println("num is: " + num);
		}
		
		
	}
	
	
	static void ex2() {
		
		System.out.println("Multi dimentsional arrays"); //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		int twoDArray1 [][] = new int[3][5];//x3 1 dim arrays with 5 elements in each (3 rows, 5 columns). 
		
		int twoDArray2 [][] = new int[3][3];//x3 1 dim arrays with 3 elements in each (3 rows, 3 columns). 
		
		double[]doubleD[]=new double[3][4];
		
		//this is new String [3][3] (x3 1 dim arrays with 3 elements in each)
		String[][]names = 
		{
			{"noel", "mick", "kevin"}, //first row. array 0. To access elements in this array: [0][x]
			{"patrica", "connie", "kate"}, //second row. array 1. To access elements in this array: [1][x]
			{"michele", "laura", "colm"} //third row. array 2. To access elements in this array: [2][x]
		};
		
		System.out.println(names[0][0]); //noel
		System.out.println(names[1][1]); //connie
		System.out.println(names[2][1]); //laura
		
		//both give outOfBoundsExceptions:
		//System.out.println(names[1][3]); 
		//System.out.println(names[3][1]); 
		
		//================================================
		
		//printing a 2dim array: ++++++++++++++++++++++++++++++++++
		
		/*
		 * To print a 2 dim array, we need to create an inner/nested loop.
		 * The outer loops takes care of the rows, and will loop 3 times.
		 * The inner loop takes care of the columns and will print 3 times.
		 */
		
		int num=names[0].length; //gives amount of elements in first row (array)
		//names.length //gives amount of rows (arrays) in outer array
		
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length;j++) {
				System.out.println("name is: "+ names[i][j]); 
			}
		}
		
		//assigning a value directly into a 2 dim array:
		names[0][1] = "bob";
		System.out.println(names[0][1]);
		
		int[][] int2D = new int[4][3];
		
		//populate the 2d array:
		for(int i=0;i<int2D.length;i++) {
			for(int j=0;j<int2D[i].length;j++) {
				int2D[i][j]= i+j; 
			}
		}
		
		for(int i=0;i<int2D.length;i++) {
			for(int j=0;j<int2D[i].length;j++) {
				System.out.println(int2D[i][j]);
			}
		}
		
		//===prints out the first number in every row 
		for(int i=0;i<int2D.length;i++) {
				System.out.println(int2D[i][0]);
		}
	
		
	}
	
	static void ex3() {
		
		System.out.println("3 dim arrays");
		
		//3 dim arrays ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		
		//An array of x3 2dim arrays, and each of those has x4 1 dim arrays, and each of those has 2 ints.
		int [][][]threeD = new int[3][4][2]; //i,j,k
		
		//outer loop (depth):
		for(int i=0;i<threeD.length;i++) {
			
			//rows (number of arrays):
			for(int j=0;j<threeD[i].length;j++) {
				
				//colums (number of array elements):
				for(int k=0;k<threeD[i][j].length;k++) {
					
					threeD[i][j][k] = i+j+k;
					System.out.print(threeD[i][j][k]);
					/*
					 * 000=0
					 * 001=1
					 * 010
					 * 101
					 * 011
					 * 
					 */
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//===================================================
		
		//POPULATING A 3D ARRAY +++++++++++++++++++++++++++++++++++++++++++++
		//to make an array; [2][3][3] - 2 2d arrays, each with 3 1d array, each with 3 elements.
		
		
		int[][][]threeD2 = { //new int[2][3][3]
				
			//first 2d array:
			{
				//inside the 2d array are 3 1d arrays: 
				{23, 45, 67}, //each array has 3 elements
				{3, 567, 890}, //To access elements in this array: [0][2][x]
				{69, 99, 100}
			},
			
			//second 2d array:
			{
				{99, 991, 1000}, //first row. array 0. To access elements in this array: [1][0][x]
				{45, 88, 9345}, //second row. array 1. To access elements in this array: [1][1][x]
				{567, 321, 9345} //third row. array 2. To access elements in this array: [1][2][x]
			}
				
		};//threeD2
		
		
		//=========
		
		int[]numArray1 = {3,5,88};
		int[]numArray2 = {33,44,88};
		int[]numArray3 = {66,77,99};
		
		//make a 2d array from above arrays:
		int[][]twoDMakeUp = { //[3][3]
			
			//adding 3 1d arrays:
			numArray1,
			numArray2,
			numArray3
		};
		
		
		//make a 3d array:
		int[][][]threeDMakeUp = { //[2][3][3]
			
			//adding 2 2d arrays:
			twoDMakeUp, 
			twoDMakeUp
		};
		
		
		//=====================================================================
		
		
		//ASYMETRIC MULTIDIMENSIONAL ARRAY +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		//different amounts of numbers on each line
		
		int[][]numbers= { // = [2][3]
			{34,56,78},
			{34,56,78}
		};
		
		//this is the ONLY way to create an asymetric array (can't use a loop)
		int[][]asymetricNum= {
			{45,67,8},
			{45},
			{45,67},
			{45,67,8,100},
			{45,67,8}
		};
		
	}//ex3
	
	
	static void ex4() {
		
		/*if no values are intitialsed in the array, the default value is given to each element in the array. 0 or 0.0 (for floats & doubles)
		 * for booleans its flase
		 * for chars its a blank ''
		 * for objects its null
		 */
		
		int[]numbers = new int[5];
		double[]dNumbers = new double[5];
		boolean[]booleans = new boolean[5];
		char[]characters = new char[5];
		String[]strings = new String[5];
		
		for(int i=0;i<5;i++) {
			System.out.println(numbers[i]);
			System.out.println(dNumbers[i]);
			System.out.println(booleans[i]);
			System.out.println(characters[i]);
			System.out.println(strings[i]);
		}
			
		
		
		
	}
	
	

}
