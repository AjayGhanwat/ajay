/******************************************************************************
 *  Compilation:  javac -d bin FunctionExamples.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionExamples
 *  
 *  Purpose: Demonstrate static methods with various properties. This includes 
 *           the following
 *           1. Static Methods with Multiple arguments
 *           2. A Class having multiple static methods 
 *           3. Static methods Overloading with different signatures are different methods
 *           4. Static Method with Multiple return statements.
 *           5. Static Method with Single return value.
 *           6. Understand Scope of a Variable. In Java the Scope of the variable is
 *              between the two blocks {...} it is defined...
 *
 *           This Class demonstrates all the properties described above. This 
 *           Class has multiple statuc methods to demonstrate the same.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.util;

public class FunctionExamples {

   /**
    * Find absolute value of an int value
    *
    * @param x to find the abs value
    * @return Abs value of x
    */
   public static int abs(int x) {
      if (x < 0) return -x;
      else       return  x;
   }

   /**
    * The primary object if this static method is to demonstrate overloading to find absolute 
    * of a double value 
    *
    * @param x to find the abs value
    * @return Abs value of x
    */
   public static double abs(double x) {
      if (x < 0) return -x;
      else       return  x;
   }

   /**
    * The primary object if this static method is to demonstrate multiple return statements
    *
    * @param n to check if it is prime 
    * @return true if prime else false
    */
   public static boolean isPrime(int n) {
      if (n < 2) return false; 
      for (int i = 2; i <= n/i; i++) {
         if (n % i == 0) return false; 
      }
      return true; 
   }

   /**
    * The primary object if this static method is to demonstrate method with multiple arguments
    * using hypotenuse of a right triangle
    *
    * @param a is one of the sides of a right triangle
    * @param b is the other sides of a right triangle
    * @return length of the hypotenuse
    */
   public static double hypotenuse(double a, double b) {
      return Math.sqrt(a*a + b*b);
   }

   public static void main(String[] args) {
   }
}
