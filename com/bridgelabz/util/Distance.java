/***************************************************************************
* Perpose : Takes two command­line arguments x and y and distance from point (x, y) to origin (0, 0)
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

class Distance {
	public static void main(String args[]) {

		//Takes commandline arguments
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);

		double a = Math.pow(x,2);
		double b = Math.pow(y,2);

		double dist = Math.sqrt(a+b);

		System.out.println("Distance from ("+ x +","+ y +") to(0,0) = "+ dist);
	} 
}
