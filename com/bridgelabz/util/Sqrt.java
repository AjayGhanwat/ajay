/******************************************************************************************************
 *Perpose: Compute the square root of a nonnegative number c given in the input using Newton's method.
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 10-08-2017
 *******************************************************************************************************/

package com.bridgelabz.util;

public class Sqrt {

    public static void main(String args[]) {

        double c = Double.parseDouble(args[0]);

        double epsilon = 1e-15;

        double t = c;          

        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }

        // prints square root of c
        System.out.println(t);
    }

}
