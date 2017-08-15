/***************************************************************************
* Perpose : Find the binary number for given number as command line argument
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 11-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class Binary {

   void binaryNumber(int number) {

      //takes the command line argument from user
      int nNumber = number;

      int mReminder,i = 0 ;

      while(nNumber > 0) {
         mReminder = nNumber % 2;
         nNumber = nNumber / 2;
         if(i==4) 
           System.out.print(" ");
         System.out.print(mReminder);
         i++;
      }

      System.out.println();

   }
   public static void  main(String args[]) {
       
      Binary b = new Binary();
      b.binaryNumber(Integer.parseInt(args[0]));
   }
}
