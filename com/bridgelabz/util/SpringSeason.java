/***************************************************************************
* Perpose : Spring Season
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

class SpringSeason {

	void isSpring(int day,int month){
		//Taking Input at the time of runtime
		int mDay = day;
		int mMonth = month;

		//display true if condition is true otherwise false
		boolean mIsSpringSeason = ( mDay >= 20 && mDay<= 31 && mMonth == 3) || ( mDay >= 1 && mDay<= 30 && mMonth == 4) || ( mDay >= 1 && mDay<= 31 && mMonth == 5) || ( mDay >= 1 && mDay<= 20 && mMonth == 6);

		if(mIsSpringSeason == true)
			System.out.println("It is a Spring Season.");
		else
			System.out.println("It is not a Spring season.");
	}
	public static void main(String args[]) { 

		SpringSeason ss = new SpringSeason();
		ss.isSpring(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
	}
}
