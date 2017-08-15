/*****************************************************************************************
* Perpose : Find the 2nd last greater number and 2nd smaller number from unsorted array
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 10-08-2017
******************************************************************************************/

package com.bridgelabz.util;

class Find {

    int[] givenArray = {12,45,65,48,75,10,35,41,98,11};

    int mMax1 = givenArray[0], mMin1 = givenArray[0];

    int mMax2 = 0, mMin2 = 00;

    void SecondMax(){
        //Find the 2nd last greater number from unsorted array
        for(int i = 0; i < givenArray.length; i++) {

            if(mMax1 < givenArray[i]) {
                mMax2 = mMax1;
                mMax1 = givenArray[i];
            }
        }

        //display the 2nd last greater number
        System.out.println("Second Last Max Number is "+mMax2);
    }

    void SecondSmall(){
        //Find the 2nd smaller number from unsorted array
        for(int i = 0; i < givenArray.length; i++) {

            if(mMin1 > givenArray[i]) {
                mMin2 = mMin1;
                mMin1 = givenArray[i];
            }
        }

        //display the 2nd smaller number
        System.out.println("Second Last Min Number is "+mMin2);
    }

   public static void main(String args[]) {

        Find f = new Find();
        f.SecondMax();
        f.SecondSmall();
   }
}
