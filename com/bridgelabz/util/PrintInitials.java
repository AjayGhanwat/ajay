/***************************************************************************
* Perpose : Prints Initials
*
*@author : Ajay Ghanwat
*@version : 1.8.0
*@since : 12-08-2017
****************************************************************************/

package com.bridgelabz.util;

class PrintInitials {
   public static void main(String args[]) {
      String a = args[0];

      switch(a) {
         case "a" : 
        System.out.println("        **         ");
        System.out.println("       ** **       ");
        System.out.println("      **   **      ");
        System.out.println("     **     **     ");
        System.out.println("    ***********    ");
        System.out.println("   **         **   ");
        System.out.println("  **           **  ");
        System.out.println(" **             ** ");
        System.out.println("**               **");
        break;
         case "b" :
        System.out.println("****************   ");
        System.out.println("**             **  ");
        System.out.println("**              ** ");
        System.out.println("**              ** ");
        System.out.println("*****************  ");
        System.out.println("**             **  ");
        System.out.println("**              ** ");
        System.out.println("**             **  ");
        System.out.println("****************   ");

        break;
 
         case "c" : 
        System.out.println("   **************  ");
        System.out.println("  **               ");
        System.out.println(" **                ");
        System.out.println("**                 ");
        System.out.println("**                 ");
        System.out.println(" **                ");
        System.out.println("  **               ");
        System.out.println("   **              ");
        System.out.println("    ************** ");
        break;
       }
   }
}