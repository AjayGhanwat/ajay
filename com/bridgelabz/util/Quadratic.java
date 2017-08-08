/***************************************************************************
* Perpose : Quadratic Equations root1 root2
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class Quadratic {

	public static void main(String args[]) {
		
		//a,b,c used Input from user
		int a,b,c;
	
		//Stored the root1 and root2 
		double root1,root2,d;

		Scanner sc = new Scanner(System.in);

		//takes input from user
		System.out.println("Giver Qudratic Equation Is : ax^2+bx+c");
		System.out.print("Enter a:");
		a = sc.nextInt();
		System.out.print("Enter b:");
		b = sc.nextInt();
		System.out.print("Enter c:");
		c = sc.nextInt();
		System.out.println("Giver Qudratic Equation Is : "+ a +"x^2+"+ b +"x+"+ c);

		//find the values of d
		d = b * b - 4 * a * c;

		if ( d > 0 ) {
			System.out.print("roots are real and unequal");
			root1 = ( - b + Math.sqrt(d) ) / (2*a);
			root2 = ( - b - Math.sqrt(d) ) / (2*a);
			System.out.println("Firts Root is : " + root1 );
			System.out.println("Second Root is : " + root2 );
		}
		else if( d == 0 ) {
			System.out.println("Root are real and equl");
			root1 = ( -b + Math.sqrt(d) ) / (2*a);
			System.out.println("Root : "+ root1);
		}
		else 
			System.out.println("Root are Imaginary.");

	}
}
