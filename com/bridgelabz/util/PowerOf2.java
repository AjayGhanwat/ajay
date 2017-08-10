/********************************************************************************
 *Perpose: Takes the command Line arguments And Prints the table of power of 2
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 06-08-2017
 ********************************************************************************/

package com.bridgelabz.util;

class PowerOf2 {

   public static void main(String args[]) {

      //Takes the inpute from Command line arguments 
      int mNumber = Integer.parseInt(args[0]);
      
      //Calculates the Power of 2
      for(int i = 0; i <= mNumber; i++)
         System.out.println(i +" "+Math.pow(2,i));
   }
}
