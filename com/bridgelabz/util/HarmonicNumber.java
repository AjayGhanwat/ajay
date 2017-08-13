/*************************************************
 *Perpose: Harmonic Number
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 10-08-2017
 **************************************************/

package com.bridgelabz.util;

class HarmonicNumber {

   void harmonic(int given){

      //i is used as Counter variable
      float i = 1;

      //Stored the harmonic number
      double mHarmonicNumber = 0;

      int mNthNumber = given;

      //Calculates the harmonic number 
      while(i <= mNthNumber) {
         System.out.print("+");
         mHarmonicNumber = mHarmonicNumber + (1/i) ;
	 System.out.print("1/"+i);
         i++;
      }
      System.out.println(" = "+mHarmonicNumber);
   }
   public static void main(String args[]) {
   
   HarmonicNumber h = new HarmonicNumber();
   h.harmonic(Integer.parseInt(args[0]));
   
   }
}
