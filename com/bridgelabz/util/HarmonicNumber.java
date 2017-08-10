/*************************************************
 *Perpose: Harmonic Number
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 10-08-2017
 **************************************************/

package com.bridgelabz.util;

class HarmonicNumber {

   public static void main(String args[]) {

      //i is used as Counter variable
      float i = 1;

      //Stored the harmonic number
      double h = 0;

      int mNthNumber = Integer.parseInt(args[0]);

      //Calculates the harmonic number 
      while(i <= mNthNumber) {
         System.out.print("+");
         h = h + (1/i) ;
	 System.out.print("1/"+i);
         i++;
      }
      System.out.println(" = "+h);
   }
}
