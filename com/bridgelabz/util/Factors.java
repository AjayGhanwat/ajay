/***************************************************************************
* Perpose : Prime Factorization
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 08-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class Factors {

    public static void main(String[] args) { 

        // takes input from command-line argument
        long n = Long.parseLong(args[0]);

        System.out.print("The prime factorization of " + n + " is: ");

        // for each potential factor
        for (long factor = 2; factor*factor <= n; factor++) {

            while (n % factor == 0) {
                System.out.print(factor + " "); 
                n = n / factor;
            }
        }

        if (n > 1) System.out.println(n);
        else       System.out.println();
    }
}