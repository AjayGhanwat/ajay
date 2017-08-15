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

	//a,b,c used Input from user
	int mA,mB,mC;

	//Stored the root1 and root2
	double root1,root2,mD;

	Scanner sc = new Scanner(System.in);

	void findRoot(){

		//takes input from user
		System.out.println("Giver Qudratic Equation Is : ax^2+bx+c");
		System.out.print("Enter a:");
		mA = sc.nextInt();
		System.out.print("Enter b:");
		mB = sc.nextInt();
		System.out.print("Enter c:");
		mC = sc.nextInt();
		System.out.println("Giver Qudratic Equation Is : "+ mA +"x^2+"+ mB +"x+"+ mC);

		//find the values of d
		mD = mB * mB - 4 * mA * mC;

		if ( mD > 0 ) {
			System.out.print("roots are real and unequal");
			root1 = ( - mB + Math.sqrt(mD) ) / (2*mA);
			root2 = ( - mB - Math.sqrt(mD) ) / (2*mA);
			System.out.println("Firts Root is : " + root1 );
			System.out.println("Second Root is : " + root2 );
		}
		else if( mD == 0 ) {
			System.out.println("Root are real and equl");
			root1 = ( -mB + Math.sqrt(mD) ) / (2*mA);
			System.out.println("Root : "+ root1);
		}
		else
			System.out.println("Root are Imaginary.");
	}

	public static void main(String args[]) {

		Quadratic q = new Quadratic();
		q.findRoot();
	}
}
