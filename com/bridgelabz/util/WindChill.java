/***************************************************************************
* Perpose : Day of the week that date falls on.
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 09-08-2017
****************************************************************************/

package com.bridgelabz.util;

class WindChill {

   public static void main(String args[]) {

      //Takes input from user cOMMAND LINE ARGUMENT
      double mTemp = Double.parseDouble(args[0]);
      double mSpeed = Double.parseDouble(args[1]);
      mTemp = Math.abs(mTemp);

      //CALCULATE WIND CHILL IF TEMP IS LESS AND SPEED IS GREATER THAN 120
      if(mTemp <= 50 && (mSpeed < 120 || 3 < mSpeed)) {
         mSpeed = Math.pow(mSpeed,0.16);
         double mWind = 35.74 + 0.6215 * mTemp + (0.4275 * mTemp - 35.75) * mSpeed;
         System.out.println("Wind Chill is "+mWind);
      }
      else 
         System.out.println("Tempreture(F) is larger that 50  otherwies Speed lower than 3 and greater than 120 ..");
   }
}
