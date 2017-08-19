/********************************************************************************
 *Perpose: String Functions like Anagram and palindrome
 *
 *@author:Ajay Ghanwat
 *@version: 1.8
 *@since: 10-08-2017
 ********************************************************************************/

package com.bridgelabz.lib;

class StringFunctions{

    static String isAnagram_Msg = "String are Anagram";

    static String isNotAnagram_Msg = "String are not Anagram";

    static String isPalindrome_Msg = "String is Palindrome";

    static  String isNotPalindrome_Msg = "String is Not Palindrome";

    static char[] stringArray(String str){
        int length = str.length();
        char[] mString = new char[length];
        for(int i =0; i < length; i++){
            mString[i] = str.charAt(i);
        }
        return mString;
    }

    public static String isAnagram(String str1, String str2){

        boolean mAnagram = false;

        int lengthFirst = str1.length();
        int lengthSecond = str2.length();

        if(lengthFirst == lengthSecond) {

            for (int i = 0; i < lengthFirst; i++) {

                for (int j = 0; j < lengthFirst; j++) {

                    if (str1.charAt(i) == str2.charAt(j)) {

                        mAnagram = true;
                        break;
                    }
                }
            }
        }

        if(mAnagram== true)
            return isAnagram_Msg;
        else
            return isNotAnagram_Msg;
    }

    public static String isPalindrome(String str1){
        boolean mmPalindrome = false;

        int length1 = str1.length();

        for(int i = 0, j = length1 - 1; i < j; i++, j--){

            if(str1.charAt(i) == str1.charAt(j)){

                mmPalindrome = true;
                break;
            }
        }
  
        if(mmPalindrome == true)
            return isPalindrome_Msg;
        else
            return isNotPalindrome_Msg;

    }

    public static void isEqual(String str1, String str2){
        char lengthStringFirst[] = stringArray(str1);
        char lengthStringSecond[] = stringArray(str2);

        boolean isEqualString = true;

        if(lengthStringFirst.length == lengthStringSecond.length){
            for(int i = 0; i < lengthStringFirst.length; i++) {
               if(lengthStringFirst[i] != lengthStringSecond[i]) {
                  isEqualString = false;
                  break;
               }
            }
        }
      
        if(isEqualString == true) 
           System.out.println("Strings are Equal");
        else 
           System.out.println("Strings are not Equal");
    } 

    public static void main(String args[]){
   
    }
}