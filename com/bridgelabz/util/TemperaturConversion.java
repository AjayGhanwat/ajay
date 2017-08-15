/***************************************************************************
* Perpose : Convert Tempreture from Celsius To Fahrenheit
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

class TemperaturConversion {

   Scanner sc = new Scanner(System.in);

   //Takes Temprature as input in runtime
   double mC,mF;

   void convertCtoF(){
      System.out.print("Enter The Temprature in Celsius : ");
      mC = sc.nextDouble();

      mF = (mC * 9/5) + 32;
      System.out.println("Temprature in Fahrenheit is "+mF);
   }

   void convertFtoC(){
      System.out.print("Enter The Temprature in Fahrenheit: ");
      mF = sc.nextDouble();

      mC = (mF - 32)*  5/9;
      System.out.println("Temprature in Celsius is "+mC);
   }
   public static void main(String args[]) {

      TemperaturConversion t = new TemperaturConversion();
      t.convertCtoF();
      t.convertFtoC();
   }
}
