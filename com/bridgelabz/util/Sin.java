/********************************************************************
* Purpose : sin x using the tylor series expansion
*
* @author : Ajay Ghanwat
* @version : 1.8.0
* @since : 13-08-2017
*********************************************************************/

package com.bridgelabz.util;



class Sin {

   public static int factorial(int mFact) {
      int mFactorial = 1;
      for(int i = mFact; i > 0; i--) {
         mFactorial *=i;
      }
      return mFactorial;
   }

   void findSin(double nAngle, double nCount){

      double angle = nAngle;

      double count = nCount;

      angle = angle % (2 * Math.PI);

      int flag = 0;

      int power = 3;

      double sinx = 0;

      sinx += angle;

      while(count > 0) {
         if(flag == 1) {
            sinx += (Math.pow(angle, power)/factorial(power));
            count--;
            power+= 2;
            flag = 0;
         }
         else {
            sinx -= (Math.pow(angle, power)/factorial(power));
            count--;
            power+= 2;
            flag = 1;
         }
      }
      System.out.println(sinx);
   }
   
   public static void main(String args[]) {
      
      Sin s = new Sin();
      s.findSin(Double.parseDouble(args[0]),Double.parseDouble(args[1]));
   }
}
