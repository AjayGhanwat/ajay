/***************************************************************************
* Perpose : calculates the monthly payments you would have to make
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 09-08-2017
****************************************************************************/

package com.bridgelabz.util;

class CarLoan {

   void calculate(Double principle,int year,Double rate) {

      //Takes input from user at command Line arguments
      double mPrinciple = principle;
      int mYear = year;
      double mRate = rate;

      //Calculates Payment need to be completed per Month
      int n = 12 * mYear;
      double r = mRate / (12 * 100);
      double a = Math.pow((1 + r),(-n));
      double payment = (mPrinciple * r)/(1 - a);

      System.out.println("Payment Per Month is "+ payment);
   }

   public static void main(String args[]) {

      CarLoan cl = new CarLoan();
      cl.calculate(Double.parseDouble(args[0]),Integer.parseInt(args[1]),Double.parseDouble(args[2]));
      
   }
}
