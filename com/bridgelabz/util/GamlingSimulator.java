/***************************************************************************
* Perpose : Gambling Simulatore
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 12-08-2017
****************************************************************************/

package com.bridgelabz.util;

public class GamlingSimulator { 

    void winLoss(int mCash,int mG , int mT) {
        //Takes inpute from user that win,goal and number if trials
        int mStake  = mCash;   
        int mGoal   = mG;   
        int mTrials = mT;   

        //no of bets and wins
        int bets = 0;     
        int wins = 0;      

        //loop to count bets and win and rechesh the goal or not 
        for (int t = 0; t < mTrials; t++) {

            
            int cash = mStake;
            while (cash > 0 && cash < mGoal) {
                bets++;
                if (Math.random() < 0.5) cash++;     
                else                     cash--;     
            }
            if (cash == mGoal) wins++;               
        }

        //prints the winn , percentage of win and avg bets
        System.out.println(wins + " wins of " + mTrials);
        System.out.println("Percent of games won = " + 100.0 * wins / mTrials);
        System.out.println("Avg # bets           = " + bets / mTrials);
    }

    public static void main(String[] args) {

        GamlingSimulator gs = new GamlingSimulator();
        gs.winLoss(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
    }

}
