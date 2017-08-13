/********************************************************************
* Purpose : cos x using the tylor series expansion
*
* @author : Ajay Ghanwat
* @version : 1.8.0
* @since : 13-08-2017
*********************************************************************/

package com.bridgelabz.util;



class Cos {

   public static int factorial(int mFact) {
      int mFactorial = 1;
      for(int i = mFact; i > 0; i--) {
         mFactorial *=i;
      }
      return mFactorial;
   }
   
   public static void main(String args[]) {
      
      double angle = Double.parseDouble(args[0]);
       
      double count = Double.parseDouble(args[1]);

      angle = angle % (2 * Math.PI);

      int flag = 0;

      int power = 2;

      double cosx = 0;

      cosx += 1;

      while(count > 0) {
         if(flag == 1) {
            cosx += (Math.pow(angle, power)/factorial(power));
            count--; 
            power+= 2;
            flag = 0;
         }
         else {
            cosx -= (Math.pow(angle, power)/factorial(power));
            count--; 
            power+= 2;
            flag = 1;
         }
      }
      System.out.println(cosx);
   }
}
