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

   //store the binary array
   int binaryArray[] = new int[8];
   int perfectBinnary[] = new int[8];
      
   int mDivision = 1;

   //counter that counts integer number;
   int i = 0,j;

   //store the remaining bit and swapping and find convert numbers
   int remainingBit,temp,Convert = 0;

   void binaryconvert(int number) {

      int mNumber = number;

      while(mDivision <= mNumber/2)
         mDivision *= 2;
    
      while(mDivision > 0) {
         if(mNumber < mDivision) {
            binaryArray[i] = 0;
            i++;
         }
         else {
            mNumber -= mDivision;
            binaryArray[i] = 1;
            i++;
         }
         mDivision /= 2;
      }
      System.out.println();
   }

   void perfectBinary() {
   
      if(i <= 7) {
         remainingBit = 7 - i;
         for(j = 0;j <= remainingBit; j++) {
            perfectBinnary[j] = 0; }
   
         for(j = remainingBit + 1 , i = 0 ; j < 8 && i < 8 ; j++,i++) {
            perfectBinnary[j] = binaryArray[i]; }
      }

   }

   void swapping() {

      for(i = 0,j = 4; i < 4 && j < 8; i++,j++) {
         temp = perfectBinnary[i];
         perfectBinnary[i] = perfectBinnary[j];
         perfectBinnary[j] = temp;
      }
   }
   
   void convertToInt() {

      j = 0;
      for(i = 7; i >= 0; i--) {
         if(perfectBinnary[i] == 1)
            Convert += Math.pow(2,j);
         j++;
      }
      System.out.println(Convert);
   }

   void isPowerOf2(){
 
      for(i = 0; i < 8 ; i++) {
         if(Convert == Math.pow(2,i)) {
            System.out.println("Resultant Number is power of 2.");
            break;
         }
      }
   }

   void display(){

      for(j = 0;j < 8; j++) {
         System.out.print(perfectBinnary[j]); }

      System.out.println();
   }

    public static void main(String args[]) {
      
      ConvertBinary cb = new ConvertBinary();
      cb.binaryconvert(Integer.parseInt(args[0]));
      cb.perfectBinary();
      System.out.print("Binary of number is : ");
      cb.display();
      cb.swapping();
      System.out.print("Binary after swapping nibbles is : ");
      cb.display();
      System.out.print("Binary after convert is : ");
      cb.convertToInt();
      cb.isPowerOf2();
   }
}
