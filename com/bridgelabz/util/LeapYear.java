/***************************************************************************
* Perpose : Print Leap Year or Not
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class LeapYear {
	
	public static void main(String args[]) { 

		Scanner sc = new Scanner(System.in);
		
		//take input from user 
		int mYear;

		//gives true or false
		boolean mIsLeap = false ; 
		
		//getting input from user
		System.out.print("Enter Year : ");
		mYear = sc.nextInt();
		
		//find leap or not	
		if( mYear >= 1582 ) {
			mIsLeap = ( mYear % 4 ) == 0;
			mIsLeap = mIsLeap && ( mYear % 100 ) != 0;
			mIsLeap = mIsLeap || ( mYear % 400 ) == 0;
		
		if( mIsLeap == true )
			System.out.println("Leap Year");
		else 
			System.out.println("Not a Leap Year");
		}
		
	}
}
