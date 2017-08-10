/*************************************************
 *Perpose:Flips The Coin and Find the Percentage
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 10-08-2017
 **************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class FlipCoin {

   public static void main(String args[]) {
      
      //mHead and mTails is used as Counter that counts The times the Coin tossed 
      double mHead = 0,mTails = 0;
      int mTimes,i = 0;

      Scanner sc = new Scanner(System.in);

      //Take the inpute from user
      System.out.print("Enter Number of times Coin Toss : ");
      mTimes = sc.nextInt();

      //mTimes the loop is executed to display the head and tails and Counter
      while(i < mTimes) {
         if(Math.random() < 0.5 ) {
            System.out.println("Head");
	    mHead++;
	 }
         else {
            System.out.println("Tails");
            mTails++;
         }
         i++;
      }

      //To display the percentage of the coin tossed as head and tail
      System.out.println("Percentage Head is tossed is "+(mHead/mTimes)*100);
      System.out.println("Percentage Tail is tossed is "+(mTails/mTimes)*100);
   }
}
