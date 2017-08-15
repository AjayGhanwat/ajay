/***************************************************************************
* Perpose : Takes two command­line arguments x and y and distance from point (x, y) to origin (0, 0)
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

class Distance {

	void findDistance(int xAxis,int yAxis) {
		//Takes commandline arguments
		int mXAxis=xAxis;
		int mYAxis=yAxis;

		double xPower = Math.pow(mXAxis,2);
		double yPower = Math.pow(mYAxis,2);

		double dist = Math.sqrt(xPower+yPower);

		System.out.println("Distance from ("+ mXAxis +","+ mYAxis +") to(0,0) = "+ dist);
	}
	public static void main(String args[]) {

		Distance d = new Distance();
		d.findDistance(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	} 
}
