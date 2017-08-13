/***************************************************************
* Purpose : Convert To binary and perfoms swaping nibbles and
*           find number and find resultant number is power of 2.
*
* @author : Ajay Ghanwat
* @version : 1.8.0
* @since : 13-08-2017
****************************************************************/

package com.bridgelabz.util;

class ConvertBinary {
   public static void main(String args[]) {
      
      int a[] = new int[8];
      int b[] = new int[8];
      
      int mNumber = Integer.parseInt(args[0]);
      
      int mDivision = 1,i = 0,j,s,temp,Convert = 0;

      while(mDivision <= mNumber/2)
         mDivision *= 2;
    
      while(mDivision > 0) {
         if(mNumber < mDivision) {
            System.out.print("0");
            a[i] = 0;
            i++;
         }
         else {
            System.out.print("1");
            mNumber -= mDivision;
            a[i] = 1;
            i++;
         }
         mDivision /= 2;
      }
      System.out.println();

      if(i <= 7) {
         s = 7 - i;
         for(j = 0;j <= s; j++) {
            b[j] = 0; }
   
         for(j = s + 1 , i = 0 ; j < 8 && i < 8 ; j++,i++) {
            b[j] = a[i]; }

         for(j = 0;j < 8; j++) {
         System.out.print(b[j]); }
      }
      
     /* for(j = 0;j < 8; j++)
         System.out.print(b[j]);*/
      System.out.println(); 

      for(i = 0,j = 4; i < 4 && j < 8; i++,j++) {
         temp = b[i];
         b[i] = b[j];
         b[j] = temp;
      }

      for(j = 0;j < 8; j++) {
         System.out.print(b[j]); }

      System.out.println();
       
      j = 0;
      for(i = 7; i >= 0; i--) {
         if(b[i] == 1)
            Convert += Math.pow(2,j);
         j++;
      }

      System.out.println(Convert);

      for(i = 0; i < 8 ; i++) {
         if(Convert == Math.pow(2,i)) {
            System.out.println("Resultant Number is power of 2.");
            break;
         }
      }
   }
}
