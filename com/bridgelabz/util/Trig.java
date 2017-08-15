/***************************************************************************
* Perpose : llustrate   various   trigonometric   functions
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 09-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class Trig {

	void findtrig(double mDegree){
		//Takes Input drom user at Command Line arguments
		double degrees = mDegree;
		double radians = Math.toRadians(degrees);

		double mSin = Math.sin(radians);
		System.out.println("sin("+ degrees  +") = " + mSin);

		double mCos = Math.cos(radians);
		System.out.println("cos("+ degrees +") = " + mCos);

		double mTan = Math.tan(radians);
		System.out.println("tan("+ degrees +") = " + mTan);
		System.out.println(mSin + "/" + mCos + " = " + mSin / mCos);

		double mR = mSin*mSin + mCos*mCos;
		System.out.println(mSin*mSin + " + "+ mCos*mCos + " = " + mR);
	}

   public static void main(String args[]) { 

    Trig t = new Trig();
    t.findtrig(Double.parseDouble(args[0]));
   }
}
