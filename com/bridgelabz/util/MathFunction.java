/*************************************************
 *Perpose: Mathematica Functions
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 17-08-2017
 **************************************************/

package com.bridgelabz.util;

class MathFunctions{

    static  double harmonic(int given){

        float i = 1;

        double mHarmonicNumber = 0;

        int mNthNumber = given;

        while(i <= mNthNumber) {
            System.out.print("+");
            mHarmonicNumber = mHarmonicNumber + (1/i) ;
            System.out.print("1/"+i);
            i++;
        }
        return mHarmonicNumber;
    }

    static double Sin(int number){
        double radians = Math.toRadians(number);

        double mSin = Math.sin(radians);
        return mSin;
    }

    static double Cos(int number){
        double radians = Math.toRadians(number);

        double mCos = Math.cos(radians);
        return mCos;
    }

    static String binaryNumber(int number) {

        int nNumber = number;

        String binary = "";

        int mReminder;

        while(nNumber > 0) {
            mReminder = nNumber % 2;
            nNumber = nNumber / 2;
            binary+=mReminder;
        }
        return binary;
    }

    public static void main(String args[]){
        System.out.println(" = "+harmonic(Integer.parseInt(args[0])));
        System.out.println("sin("+ Integer.parseInt(args[0])  +") = " + Sin(Integer.parseInt
                (args[0])));
        System.out.println("cos("+ Integer.parseInt(args[0])  +") = " + Cos(Integer.parseInt
                (args[0])));
        System.out.println("Binary is "+binaryNumber(Integer.parseInt(args[0])));

    }
}