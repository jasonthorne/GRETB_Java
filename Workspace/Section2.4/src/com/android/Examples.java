package com.android;


public class Examples {
	
	static void assignmentOperators() {
		System.out.println("the assignment operator: = "); //this is used for assigning values to variables.
		
		int num1 =56; //literal value
		int num2 = num1; //non literal value
		
		//You can declare as many variables as you like on the one line of the SAME TYPE:
		int a=3, b=4, d, c=66; //d doesnt have a value as it's a LOCAL variable. It has NO default value. +++++++++++++++++++++++++++++++
		//System.out.println(d); //error as it has NO value (not even 0 or null)
		
		//int z=5, double a=7; //different types, so doesnt work! 
		//===============
		
		//You cant give NEW values to more than one variable on the SAME line. 
		//b=34,e=55; //doesnt compile
		
		//the assigment operator reads from right to left
		a=10;
		b=100;
		c=1000;
		
		a=b=c; //all are now 1000
		
		boolean bool=false;
		//NEVER use the assignment operator for comparing values
		
		
		//Here it will print true
		if(bool=true) {
			System.out.println("bool is true");
		}else {
			System.out.println("bool is false");
		}
		
		
		if(bool==true) { //checks for comparison
			
		}
		
		if(bool) { //same as above. Checks for true
			
		}
		
		//=========================================
		
		a=100;
		b=10;
		a=a+b; //a is now 110
		a+=b; //same as above
		a-=b;
		a*=b;
		a/=b;
	
	}
	
	
	static void arithmeticOperators() {
		
		/*
		 * The arithmetic operators consist of some operators we are familiar with such as +,-,/,* 
		 * and some we might not be familiar with, such as:
		 * i++ post increment operator
		 * i-- post increment operator
		 * ++i pre increment operator
		 * --i pre increment operator
		 */
		
		
		/*
		 * Modulus is the remainderw when we divide an int by another int. 
		 * It DOESNT deal with doubles. 
		 * It is the remainder from integer division
		 */
		
		int num1=10;
		int num2=3;
		
		System.out.println("10 modulus 3 is: " + (num1%num2));
		
		System.out.println("\nIncrementors and decrementors:");
		
		num1 = 10;
		num2 = 3;
		
		//Pre-increment/decrement operators. First they do their thing THEN print results:
		System.out.println("\nPre-increment/decrement operators");
		System.out.println("Pre-increment (++num1): " + (++num1)); //adds, then prints 11
		System.out.println("Pre-decrement (--num2): " + (--num2)); //reduces, then prints 2
		
		num1 = 10;
		num2 = 3;
		
		System.out.println("\nPost increment/decrement operators");
		System.out.println("Post-increment (num1++): " + (num1++)); //prints, then adds (to 11)
		System.out.println("Post-decrement (num2--): " + (num2--)); //prints, then reduces (to 2)
		
		System.out.println("num1 is now: " + num1 + ". num2 is now: " + num2); //prints, then reduces (to 2)
		
		//Test operators:
		num1=10;
		num2=100;
		int sum = num1 + num2++;
		System.out.println("\nsum is: " + sum);
		System.out.println("num2 is: " + num2);
		
		num1=10;
		num2=100;
		sum = num1 + ++num2;
		System.out.println("\nsum is: " + sum);
		System.out.println("num2 is: " + num2);
		
		num1=10;
		num2=100;
		sum = ++num1 + ++num2;
		System.out.println("\nsum is: " + sum); //112
		System.out.println("num2 is: " + num2); //101
		
		//=========================================================
		
		//Friday questions:
		System.out.println("Friday questions:");
		
		/*
		order of precedence:
		()
		+ -
		* /
		
		*/
		
		System.out.println("\nExample 1:");
		num1=10;
		num2=100;
		sum = ++num1 - num2++;
		System.out.println("num1 is: " + num1 + " num2 is: " + num2 + " sum is: " + sum); //11, 101 (1 added after sum assignment), -89
		
		
		System.out.println("\nExample 2:");
		num1=10;
		num2=100;
		sum = ++num1 + num2++ + --num1 + --num2;
		System.out.println("num1 is: " + num1 + " num2 is: " + num2 + " sum is: " + sum); //
		
		
		System.out.println("\nExample 3:");
		num1=10;
		num2=100;
		sum = ++num1 + --num1 + num1++ + num1 - ++num2 + num2 + num2 - num2;
		System.out.println("num1 is: " + num1 + " num2 is: " + num2 + " sum is: " + sum); //
		
		
		//sum = 11 + 10 + 10 + 11 - 101 + 101 + 101 - 101 = 42
		//sum1: 11
		//num2: 101
		
		System.out.println("\nExample 4:");
		num1=10;
		num2=100;
		sum = num1-- + num2++ - num1 + num2 + ++num1 - num2 + num1--;
		System.out.println("num1 is: " + num1 + " num2 is: " + num2 + " sum is: " + sum); //
		
		//sum = num1--  num2++  num1  num2  ++num1  num2  10(9);
		//sum = 
		
		
		System.out.println("\nExample 5:");
		int i=0;
		System.out.println("loop sum");
		for(i=0;i<10;i++) { //0, 3
			int total = ++i + i + i++; //i: 1 + 1 + 1(2) = 3., 4 + 4 + 4(5) = 12
			System.out.println("total:" + total); //3, 12
			System.out.println("i is:" + i); //2, 5
		}
		
		
		
		//ASCII key values can be treated as numbers: //++++++++++++++++++++++++++++++++
		
		char char1 = 'a'; //a has the value of 97
		System.out.println("char is: " + char1);
		//add 1 to the ascii key value and it becomes 98:
		char1++;
		System.out.println("char is now: " + char1);
		
		
		//print alphabet:
		System.out.println("\nprint alphabet:");
		char aplh = 'a';
		
		for(int j=0;j<26;j++){
			System.out.print(aplh + " ");
			aplh++;
		}
		
		
	}

}
