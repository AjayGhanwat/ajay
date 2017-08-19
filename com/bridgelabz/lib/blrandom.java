/*************************************************
 *Perpose:
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 17-08-2017
 **************************************************/

package com.bridgelabz.lib;

import java.util.Random;

class blrandom{

    private static long seed;
    private static Random random;
    public static void setSeed(long s) {
        seed = s;
        random = new Random(seed);
    }

    public static long getSeed(){
        return seed;
    }

    public static void main(String args[]) {

    }
}