/***************************************************************************
* Perpose : Prime Factorization
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class Factors {

    void findPrimeFactor(long Number) {
        // takes input from command-line argument
        long mNumber = Number;

        System.out.print("The prime factorization of " + mNumber + " is: ");

        // for each potential factor
        for (long factor = 2; factor*factor <= mNumber; factor++) {

            while (mNumber % factor == 0) {
                System.out.print(factor + " ");
                mNumber = mNumber / factor;
            }
        }

        if (mNumber > 1) System.out.println(mNumber);
        else       System.out.println();
    }

    public static void main(String[] args) { 

        Factors f = new Factors();
        f.findPrimeFactor(Long.parseLong(args[0]));
    }
}