/********************************************************************************
 *Perpose: Takes the command Line arguments And Prints the table of power of 2
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 06-08-2017
 ********************************************************************************/

package com.bridgelabz.util;

class PowerOf2 {

   void findPower(int number) {

      //Takes the inpute from Command line arguments
      int mNumber = number;

      //Calculates the Power of 2
      for(int i = 0; i <= mNumber; i++)
         System.out.println(i +" "+(int)Math.pow(2,i));
   }

   public static void main(String args[]) {

    PowerOf2 p = new PowerOf2();
    p.findPower(Integer.parseInt(args[0]));
   }
}
