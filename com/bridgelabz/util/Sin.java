/*****************************************************************************************
* Perpose :  compute sin x and cos x using the Taylor series expansions
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 10-08-2017
******************************************************************************************/

package com.bridgelabz.util;

public class Sin {

    public static void main(String[] args) { 
        double x = Double.parseDouble(args[0]);

        // convert x to an angle
        x = x % (2 * Math.PI);

        // compute the Taylor series
        double term = 1.0;      
        double sum  = 0.0;      

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        System.out.println(sum);
    }
}