/***************************************************************************
* Perpose : Day of the week that date falls on.
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 09-08-2017
****************************************************************************/

package com.bridgelabz.util;

class DayOfWeek {

   void day(int month,int day,int year) {

       //Takes input from user as command Line argument
       int mMonth = month;
       int mDay = day;
       int mYear = year;

       //Calculate the date fall on
       int y = mYear - (14 - mMonth) / 12;
       int x = y + y / 4 - y / 100 + y / 400;
       int m = mMonth + 12 * x * ((14 - mMonth) / 12) - 2;
       int d = (mDay + x + 31 * m / 12) % 7;

       System.out.println(d);

   }
   public static void main(String args[]) {
       DayOfWeek d =  new DayOfWeek();
       d.day(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
   }
}
            

