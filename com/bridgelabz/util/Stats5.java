/***************************************************************************
* Perpose : Print Avg, Min and Max of random number that generated from 0 to 1
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class Stats5 {

   //Generate Random Number from 0 to 1
   double mFirst = Math.random();
   double mSecond = Math.random();
   double mThree = Math.random();
   double mFour = Math.random();
   double mFive = Math.random();

   void findAvg(){
      //Calculates Avg of 5 Random numbers
      double mAvg = (mFirst+mSecond+mThree+mFour+mFive)/5;
      System.out.println("Avg value is "+mAvg);
   }

   void findMin(){
      //Calculates Min value from 5 random numbers
      double mMin = Math.min(mFirst,Math.min(mSecond,Math.min(mThree,Math.min(mFour,mFive))));
      System.out.println("Min value is "+mMin);
   }

   void findMax(){
      //Calculates Max value from 5 random numbers
      double mMax = Math.max(mFirst,Math.max(mSecond,Math.max(mThree,Math.max(mFour,mFive))));
      System.out.println("Max value is "+mMax);
   }

   public static void main( String args[]) {

      Stats5 s = new Stats5();
      s.findAvg();
      s.findMax();
      s.findMin();
   }
}