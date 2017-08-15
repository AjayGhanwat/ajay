/******************************************************************************************************
 *Perpose: Compute the square root of a nonnegative number c given in the input using Newton's method.
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 10-08-2017
 *******************************************************************************************************/

package com.bridgelabz.util;

public class Sqrt {

    void findSqrt(double number){
        double mNumber = number;

        double epsilon = 1e-15;

        double t = mNumber;

        while (Math.abs(t - mNumber/t) > epsilon*t) {
            t = (mNumber/t + t) / 2.0;
        }

        // prints square root of mNumber
        System.out.println(t);
    }

    public static void main(String args[]) {

        Sqrt s = new Sqrt();
        s.findSqrt(Double.parseDouble(args[0]));
    }

}
