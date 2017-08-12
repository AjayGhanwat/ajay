/***************************************************************************
* Perpose : Gambling Simulatore
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 12-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class GamlingSimulator { 

    public static void main(String[] args) {

        //Takes inpute from user that win,goal and number if trials
        int mStake  = Integer.parseInt(args[0]);   
        int mGoal   = Integer.parseInt(args[1]);   
        int mTrials = Integer.parseInt(args[2]);   

        //no of bets and wins
        int bets = 0;     
        int wins = 0;      

        //loop to count bets and win and rechesh the goal or not 
        for (int t = 0; t < mTrials; t++) {

            
            int cash = mStake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     
                else                     cash--;     
            }
            if (cash == goal) wins++;               
        }

        //prints the winn , percentage of win and avg bets
        System.out.println(wins + " wins of " + mTrials);
        System.out.println("Percent of games won = " + 100.0 * wins / mTrials);
        System.out.println("Avg # bets           = " + 1.0 * bets / mTrials);
    }

}