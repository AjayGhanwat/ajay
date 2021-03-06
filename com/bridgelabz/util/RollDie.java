/********************************************************************************
*Perpose: Dice Roll and find max time the ISde Comes 
*
*@author:Ajay Ghanwat
*@version: 1.8
*@since: 10-08-2017
********************************************************************************/

package com.bridgelabz.util;

import java.util.Random;

class RollDie {

    Random r = new Random();

    //Counter for count the side comes n times
    int Side1 = 0, Side2 = 0, Side3 = 0, Side4 = 0, Side5 = 0, Side6 = 0;

    public static void main(String args[]){

       RollDie rd = new RollDie();
       rd.findSideRolled(Integer.parseInt(args[0]));
    }

    void findSideRolled(int number){

        //Takes command Line arguments
        int mNumber = number;

        //Dices n times the side store in array
        int mDice[] = new int[mNumber];

        //Loop fo increamts the side comes
        for(int i = 0; i < mNumber; i++) {
            mDice[i] = r.nextInt(6) + 1;
            switch (mDice[i]) {
                case 1: Side1++;
                    break;
                case 2: Side2++;
                    break;
                case 3: Side3++;
                    break;
                case 4: Side4++;
                    break;
                case 5: Side5++;
                    break;
                case 6: Side6++;
                    break;
            }
        }
        //Call the methode that Check and prints the result
        CheckSide(Side1,Side2,Side3,Side4,Side5,Side6);
    }
    //Display the which Side Comes more times and prints output
    public static void CheckSide(int S1,int S2,int S3,int S4,int S5,int S6){
        if(S1 >= S2 && S1 >= S3 && S1 >= S4 && S1 >= S5 && S1 >= S6)
            System.out.println("Max no. of appearance of side 1 is "+S1);
        if (S2 >= S1 && S2 >= S3 && S2 >= S4 && S2 >= S5 && S2 >= S6)
            System.out.println("Max no. of appearance of side 2 is "+S2);
        if (S3 >= S1 && S3 >= S2 && S3 >= S4 && S3 >= S5 && S3 >= S6)
            System.out.println("Max no. of appearance of side 3 is "+S3);
        if (S4 >= S1 && S4 >= S2 && S4 >= S3 && S4 >= S5 && S4 >= S6)
            System.out.println("Max no. of appearance of side 4 is "+S4);
        if (S5 >= S1 && S5 >= S2 && S5 >= S3 && S5 >= S4 && S5 >= S6)
            System.out.println("Max no. of appearance of side 5 is "+S5);
        if (S6 >= S1 && S6 >= S2 && S6 >= S3 && S6 >= S4 && S6 >= S5)
            System.out.println("Max no. of appearance of side 6 is "+S6);
    }

}
