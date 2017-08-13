/***************************************************************************
* Perpose : Find the binary number for given number as command line argument
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 11-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class Binary {

   public static void  main(String args[]) {
       
      //takes the command line argument from user
      int nNumber = Integer.parseInt(args[0]);

      int d;

      while(nNumber > 0) {
         d = nNumber % 2;
         nNumber = nNumber / 2;

         System.out.print(d);
      }
      System.out.println();
   }
}
