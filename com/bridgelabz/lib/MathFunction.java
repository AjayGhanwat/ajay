/*************************************************
 *Perpose: Mathematica Functions
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 17-08-2017
 **************************************************/

package com.bridgelabz.lib;

class MathFunctions{

    public static  double harmonic(int given){

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

    public static double Sin(int number){
        double radians = Math.toRadians(number);

        double mSin = Math.sin(radians);
        return mSin;
    }

    public static double Cos(int number){
        double radians = Math.toRadians(number);

        double mCos = Math.cos(radians);
        return mCos;
    }

    public static String binaryNumber(int number) {

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

    public static double findSqrt(double number){
        double mNumber = number;

        double epsilon = 1e-15;

        double t = mNumber;

        while (Math.abs(t - mNumber/t) > epsilon*t) {
            t = (mNumber/t + t) / 2.0;
        }

        return t;
    }

    public static double findSqrt(double number,double epsilon){
        double mNumber = number;

        double t = mNumber;

        while (Math.abs(t - mNumber/t) > epsilon*t) {
            t = (mNumber/t + t) / 2.0;
        }

        return t;
    }

    public static boolean isPrime(int number) {
        boolean isPrimeNumber = false;
        int flag = 0;
        if (number != 0) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    flag++;
                }
            }
            if (flag == 2) {
                isPrimeNumber = true;
                return isPrimeNumber;
            }
            else
                return isPrimeNumber;
        }
        else
            return isPrimeNumber;
    }

    public static long factorial(int number){
        long mNumber = 1;
        while(number >= 1){
            mNumber = mNumber * number;
            number--;
        }
        return mNumber;
    }

    public static double futureValue(double doller, double rate, double period){

        double mFutureValue = doller * (Math.pow((1 + rate), period));

        return mFutureValue;
    }

    public static double presentValue(double doller, double rate, double period){
        double mPresentValue = doller / (Math.pow((1 + rate), period));

        return mPresentValue;
    }

    public static int maxValue(int[] numbers) {

        int mLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > mLargest) {
                mLargest = numbers[i];
            }
        }

        return mLargest;
    }

    public static int minValue(int[] numbers) {

        int mSmallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < mSmallest) {
                mSmallest = numbers[i];
            }
        }

        return mSmallest;
    }

    public static int minValue(String mNumbers[]) {

        int[] numbers = new int[mNumbers.length];

        for (int i = 0; i < mNumbers.length; i++) {
            numbers[i] = Integer.parseInt(mNumbers[i]);

        }

        int mSmallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < mSmallest) {
                mSmallest = numbers[i];
            }
        }
        return mSmallest;
    }

    public static int maxValue(String mNumbers[]) {

        int[] numbers = new int[mNumbers.length];

        for (int i = 0; i < mNumbers.length; i++) {
            numbers[i] = Integer.parseInt(mNumbers[i]);
        }
        int mLargest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > mLargest) {
                mLargest = numbers[i];
            }
        }
        return mLargest;
    }

    public static boolean checkCollinearUsingSlop(int x1, int y1, int x2, int y2, int x3, int y3) {
        int slopeAB = (y2 - y1) / (x2 - x1);
        int slopeBC = (y3 - y2) / (x3 - x2);
        int slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAC == slopeAB && slopeAB == slopeBC;
    }

    public static boolean checkCollinearUsingTriangle(int x1, int y1, int x2, int y2, int x3, int
            y3) {

        boolean isCollinear = false;

        int a = x1 - x2;
        int b = x2 - x3;
        int c = y1 - y2;
        int d = y2 - y3;

        int area = (a * d) - (b * c);

        area = 1/2 * area;

        if(area == 0)
            isCollinear = true;

        return isCollinear;
    }

    public static void main(String args[]){

    }
}