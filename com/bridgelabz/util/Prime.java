/***************************************************************************
* Perpose : Find the prime number from given number of ranges 
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 11-08-2017
****************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class Prime {

   Scanner sc = new Scanner(System.in);

   //It will takes the inpute from user that Range the program performs
   int mFrom, mTo;

   //mFlags is work as counter
   int mFlag = 0;

   void checkPrime() {

      //Takes Input from user
      System.out.print("Enter the range start from : ");
      mFrom = sc.nextInt();

      System.out.print("Enter the range end to : ");
      mTo = sc.nextInt();

      System.out.println("Prime Numbers : ");

      //nested For Loop that executed multiple times that given range
      for(int i = mFrom; i < mTo; i++) {

         //For loop that division values :
         for(int j = 1; j < mTo; j++) {

            //number is whole divisible or not
            if(i%j==0)
               mFlag++;
         }

         //Check that the counter is 2 on not if 2 it is prime number and prints
         if(mFlag == 2)
            System.out.println(i);

         mFlag = 0;
      }
   }
   public static void main(String args[]) {

      Prime p = new Prime();
      p.checkPrime();
   }
}
