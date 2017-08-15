/***************************************************************************
* Perpose : Get input and Done Some operations  using Double Values
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class DoubleOpt {

    Scanner sc = new Scanner(System.in);

    void Calculate(){
        //a,b,c is decleared To take input from user
        double mA, mB, mC;

        //Taking Input From User
        System.out.print("Enter values A:");
        mA=sc.nextDouble();
        System.out.print("Enter values B:");
        mB=sc.nextDouble();
        System.out.print("Enter values C:");
        mC=sc.nextDouble();


        //Prints The output
        System.out.println("a + b * c = "+( mA + mB * mC ));
        System.out.println("a * b + c = "+( mA * mB + mC ));
        System.out.println("c + a / b = "+( mC + mA / mB ));
        System.out.println("a % b + c = "+( mA % mB + mC ));
    }
	public static void main(String args[]) { 

       DoubleOpt d = new DoubleOpt();
       d.Calculate();
	}
}
